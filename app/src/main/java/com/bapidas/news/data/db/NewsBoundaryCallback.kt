package com.bapidas.news.data.db

import androidx.paging.PagedList
import com.bapidas.news.data.db.model.Article
import com.bapidas.news.data.network.repository.NewsRepository
import com.bapidas.news.data.network.repository.NewsRepositoryImpl.Companion.INITIAL_PAGE
import timber.log.Timber

class NewsBoundaryCallback constructor(
    private val mNewsRepository: NewsRepository
) : PagedList.BoundaryCallback<Article>() {

    private var latestLoad = true

    override fun onZeroItemsLoaded() {
        super.onZeroItemsLoaded()
        Timber.v("onZeroItemsLoaded")
        latestLoad = false
        mNewsRepository.loadNewsArticles(INITIAL_PAGE)
    }

    override fun onItemAtFrontLoaded(itemAtFront: Article) {
        super.onItemAtFrontLoaded(itemAtFront)
        Timber.v("onItemAtFrontLoaded")
        if (latestLoad) {
            mNewsRepository.loadNewsArticles(INITIAL_PAGE, latestLoad)
            latestLoad = false
        }
    }

    override fun onItemAtEndLoaded(itemAtEnd: Article) {
        super.onItemAtEndLoaded(itemAtEnd)
        Timber.v("onItemAtEndLoaded")
        mNewsRepository.loadNewsArticles()
    }
}