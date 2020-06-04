package com.bapidas.news.ui.main.news.listing.paging

import androidx.paging.ItemKeyedDataSource
import com.bapidas.news.data.network.response.NewsListResponse
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.data.repository.NewsRepositoryImpl
import com.bapidas.news.data.repository.NewsRepositoryImpl.Companion.INITIAL_PAGE
import com.bapidas.news.extensions.disposeWith
import com.bapidas.news.extensions.request
import com.bapidas.news.ui.model.Article
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class NewsDataSource(
    private val mNewsRepository: NewsRepository,
    private val compositeDisposable: CompositeDisposable
) : ItemKeyedDataSource<String, Article>() {

    private var totalNewsArticle = 0
    private var loadedNewsArticle = 0

    override fun loadInitial(
        params: LoadInitialParams<String>,
        callback: LoadInitialCallback<Article>
    ) {
        Timber.v("loadInitial ")
        mNewsRepository.fetchNewsFromRemote(INITIAL_PAGE)
            .request({
                Timber.v("Loading")
            }, {
                Timber.v("Loaded")
            }, {
                callback.onResult(mapResults(it))
            }, {
                callback.onError(it)
            })
            .disposeWith(compositeDisposable)
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadAfter ")
        val isItemPending = loadedNewsArticle < totalNewsArticle
        val nextPage = loadedNewsArticle.div(NewsRepositoryImpl.PAGE_SIZE).plus(1)
        if (isItemPending) {
            mNewsRepository.fetchNewsFromRemote(nextPage)
                .request({
                    Timber.v("Loading")
                }, {
                    Timber.v("Loaded")
                }, {
                    callback.onResult(mapResults(it))
                }, {
                    callback.onError(it)
                })
                .disposeWith(compositeDisposable)
        }
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadBefore ")
    }

    override fun getKey(item: Article): String {
        Timber.v("getKey %s ", item.toString())
        return item.publishedAt
    }

    private fun mapResults(
        newsListResponse: NewsListResponse
    ): List<Article> {
        Timber.v("mapResults ")
        loadedNewsArticle += NewsRepositoryImpl.PAGE_SIZE
        totalNewsArticle = newsListResponse.totalResults
        return newsListResponse.articles
            .map {
                Article(
                    it.publishedAt,
                    it.title,
                    it.description,
                    it.urlToImage,
                    it.source?.name
                )
            }
    }
}