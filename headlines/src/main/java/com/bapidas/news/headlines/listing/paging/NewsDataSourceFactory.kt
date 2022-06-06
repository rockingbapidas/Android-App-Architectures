package com.bapidas.news.headlines.listing.paging

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.bapidas.news.framework.interactions.NewsInteractions
import com.bapidas.news.headlines.model.Article
import kotlinx.coroutines.CoroutineScope
import timber.log.Timber

class NewsDataSourceFactory(
    private val mNewsInteractions: NewsInteractions,
    private val mCoroutineScope: CoroutineScope
) : DataSource.Factory<String, Article>() {

    private val notesLiveData = MutableLiveData<NewsDataSource>()

    override fun create(): DataSource<String, Article> {
        Timber.v("create")
        val newsDataSource = NewsDataSource(mNewsInteractions, mCoroutineScope)
        notesLiveData.postValue(newsDataSource)
        return newsDataSource
    }
}