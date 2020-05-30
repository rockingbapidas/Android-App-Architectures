package com.bapidas.news.ui.main.news.listing.paging

import androidx.paging.ItemKeyedDataSource
import com.bapidas.news.data.network.repository.NewsRepository
import com.bapidas.news.data.network.repository.NewsRepositoryImpl.Companion.INITIAL_PAGE
import com.bapidas.news.ui.model.Article
import timber.log.Timber

class NewsDataSource constructor(private val mNewsRepository: NewsRepository) :
    ItemKeyedDataSource<String, Article>() {

    override fun loadInitial(
        params: LoadInitialParams<String>,
        callback: LoadInitialCallback<Article>
    ) {
        Timber.v("loadInitial ")
        mNewsRepository.loadNewsArticles(INITIAL_PAGE, callback = callback)
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadAfter ")
        mNewsRepository.loadMoreNewsArticles(callback)
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<Article>) {
        Timber.v("loadBefore ")
    }

    override fun getKey(item: Article): String {
        Timber.v("getKey %s ", item.toString())
        return item.publishedAt
    }
}