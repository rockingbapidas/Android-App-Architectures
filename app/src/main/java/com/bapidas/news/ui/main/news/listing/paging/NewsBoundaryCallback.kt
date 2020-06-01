package com.bapidas.news.ui.main.news.listing.paging

import androidx.paging.PagedList
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.data.repository.NewsRepositoryImpl
import com.bapidas.news.data.repository.NewsRepositoryImpl.Companion.INITIAL_PAGE
import com.bapidas.news.extensions.disposeWith
import com.bapidas.news.extensions.request
import com.bapidas.news.ui.model.Article
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class NewsBoundaryCallback(
    private val mNewsRepository: NewsRepository,
    private val compositeDisposable: CompositeDisposable
) : PagedList.BoundaryCallback<Article>() {
    private var latestLoad = true
    private var totalNewsArticle = 0
    private var loadedNewsArticle = 0

    override fun onZeroItemsLoaded() {
        super.onZeroItemsLoaded()
        Timber.v("onZeroItemsLoaded")
        latestLoad = false
        loadNewsArticles(INITIAL_PAGE, latestLoad)
    }

    override fun onItemAtFrontLoaded(itemAtFront: Article) {
        super.onItemAtFrontLoaded(itemAtFront)
        Timber.v("onItemAtFrontLoaded")
        if (latestLoad) {
            loadNewsArticles(INITIAL_PAGE, latestLoad)
            latestLoad = false
        }
    }

    override fun onItemAtEndLoaded(itemAtEnd: Article) {
        super.onItemAtEndLoaded(itemAtEnd)
        Timber.v("onItemAtEndLoaded")
        loadMoreNewsArticles()
    }

    private fun loadMoreNewsArticles() {
        Timber.v("loadMoreNewsArticles ")
        val isItemPending = loadedNewsArticle < totalNewsArticle
        val nextPage = loadedNewsArticle.div(NewsRepositoryImpl.PAGE_SIZE).plus(1)
        if (isItemPending) loadNewsArticles(nextPage, latestLoad)
    }

    private fun loadNewsArticles(nextPage: Int, latestLoad: Boolean) {
        mNewsRepository.fetchNewsFromRemote(nextPage)
            .request({
                Timber.v("Loading")
            }, {
                Timber.v("Loaded")
            }, {
                cacheInLocal(latestLoad, it)
            }, {
                it.printStackTrace()
            })
            .disposeWith(compositeDisposable)
    }

    private fun cacheInLocal(
        latestLoad: Boolean,
        newsListResponse: NewsListResponse
    ) {
        Timber.v("cacheInLocal ")
        if (latestLoad)
            loadedNewsArticle = mNewsRepository.getNewsArticleTotalCount()
        else
            loadedNewsArticle += NewsRepositoryImpl.PAGE_SIZE
        totalNewsArticle = newsListResponse.totalResults
        mNewsRepository.saveNewsArticles(newsListResponse.articles)
    }
}