package com.bapidas.news.data.network.repository

import androidx.paging.DataSource
import androidx.paging.ItemKeyedDataSource
import com.bapidas.news.BuildConfig
import com.bapidas.news.common.network.disposeWith
import com.bapidas.news.common.network.request
import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.db.model.ArticleEntity
import com.bapidas.news.data.network.remote.api.NewsApi
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.bapidas.news.ui.model.Article
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class NewsRepositoryImpl constructor(
    private val mNewsApi: NewsApi,
    private val mNewsArticlesDao: NewsArticlesDao
) : NewsRepository {
    private val compositeDisposable by lazy { CompositeDisposable() }

    var totalNewsArticle = 0
    var loadedNewsArticle = 0

    override fun getNewsArticles(): DataSource.Factory<Int, Article> {
        Timber.v("getNewsArticles ")
        return mNewsArticlesDao.getNewsArticles()
            .map {
                Article(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.sourceName
                )
            }
    }

    override fun loadNewsArticles(
        page: Int,
        latestLoad: Boolean,
        callback: ItemKeyedDataSource.LoadCallback<Article>?
    ) {
        Timber.v("loadNewsArticles ")
        mNewsApi.getNewsArticles(CATEGORY, PAGE_SIZE, page, BuildConfig.API_KEY)
            .request({
                Timber.v("Loading ")
            }, {
                Timber.v("Loaded ")
            }, {
                if (BuildConfig.LOCAL_CACHE)
                    cacheInLocal(latestLoad, it)
                else
                    mapResults(it, callback)
            }, {
                if (BuildConfig.LOCAL_CACHE.not())
                    callback?.onError(it)
                Timber.v("Error %s", it.printStackTrace())
            })
            .disposeWith(compositeDisposable)
    }

    override fun loadMoreNewsArticles(callback: ItemKeyedDataSource.LoadCallback<Article>?) {
        Timber.v("loadMoreNewsArticles ")
        val isItemPending = loadedNewsArticle < totalNewsArticle
        val nextPage = loadedNewsArticle.div(PAGE_SIZE).plus(1)
        if (isItemPending) loadNewsArticles(nextPage, callback = callback)
    }

    override fun onCleared() {
        Timber.v("onCleared ")
        compositeDisposable.clear()
    }

    private fun cacheInLocal(
        latestLoad: Boolean,
        newsListResponse: NewsListResponse
    ) {
        Timber.v("cacheInLocal ")
        if (latestLoad)
            loadedNewsArticle = mNewsArticlesDao.getNewsArticlesCount()
        else
            loadedNewsArticle += PAGE_SIZE
        totalNewsArticle = newsListResponse.totalResults
        val articles = newsListResponse.articles
            .map {
                ArticleEntity(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.source?.name
                )
            }
        mNewsArticlesDao.insert(articles)
    }

    private fun mapResults(
        newsListResponse: NewsListResponse,
        callback: ItemKeyedDataSource.LoadCallback<Article>?
    ) {
        Timber.v("mapResults ")
        loadedNewsArticle += PAGE_SIZE
        totalNewsArticle = newsListResponse.totalResults
        val articles = newsListResponse.articles
            .map {
                Article(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.source?.name
                )
            }
        callback?.onResult(articles)
    }

    companion object {
        const val INITIAL_PAGE = 1
        const val PAGE_SIZE = 20
        const val CATEGORY = "business"
    }
}