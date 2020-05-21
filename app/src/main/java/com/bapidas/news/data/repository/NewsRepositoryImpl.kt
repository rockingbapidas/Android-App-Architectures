package com.bapidas.news.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.remote.api.NewsApi
import com.bapidas.news.network.disposeWith
import com.bapidas.news.network.request
import com.bapidas.news.ui.model.Article
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class NewsRepositoryImpl constructor(
    private val mNewsApi: NewsApi,
    private val mNewsArticlesDao: NewsArticlesDao
) : NewsRepository {
    private val compositeDisposable by lazy { CompositeDisposable() }
    private val mNewsBoundaryCallback by lazy { NewsBoundaryCallback(this) }
    var totalNewsArticle = 0
    var loadedNewsArticle = 0

    override fun getNewsArticles(): LiveData<PagedList<Article>> {
        val dataSourceFactory = mNewsArticlesDao.getNewsArticles()
        val config = PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)
            .setEnablePlaceholders(false)
            .setPrefetchDistance(5)
            .build()
        return LivePagedListBuilder(dataSourceFactory, config)
            .setBoundaryCallback(mNewsBoundaryCallback)
            .build()
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }

    fun loadNewsArticles(page: Int, latestLoad: Boolean = false) {
        mNewsApi.getNewsArticles(CATEGORY, PAGE_SIZE, page, BuildConfig.API_KEY)
            .request({
                Timber.e("Loading ")
            }, {
                Timber.e("Loaded ")
            }, { it ->
                if (latestLoad)
                    loadedNewsArticle = mNewsArticlesDao.getNewsArticlesCount()
                else
                    loadedNewsArticle += PAGE_SIZE
                totalNewsArticle = it.totalResults
                val articles = it.articles.map {
                    Article(
                        it.publishedAt,
                        it.title,
                        it.description,
                        it.urlToImage,
                        it.source?.name
                    )
                }
                mNewsArticlesDao.insert(articles)
            }, {
                Timber.e("Error %s", it.printStackTrace())
            })
            .disposeWith(compositeDisposable)
    }

    fun loadNewsArticles() {
        val isItemPending = loadedNewsArticle < totalNewsArticle
        val nextPage = loadedNewsArticle.div(PAGE_SIZE).plus(1)
        if (isItemPending) loadNewsArticles(nextPage)
    }

    companion object {
        const val INITIAL_PAGE = 1
        const val PAGE_SIZE = 20
        const val CATEGORY = "business"
    }
}