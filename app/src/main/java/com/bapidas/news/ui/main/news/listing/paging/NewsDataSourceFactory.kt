package com.bapidas.news.ui.main.news.listing.paging

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.ui.model.Article
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class NewsDataSourceFactory(
    private val mNewsRepository: NewsRepository,
    private val compositeDisposable: CompositeDisposable
) : DataSource.Factory<String, Article>() {

    val newsDataSourceLiveData = MutableLiveData<NewsDataSource>()

    override fun create(): DataSource<String, Article> {
        Timber.v("create")
        val mNewsDataSource = NewsDataSource(mNewsRepository, compositeDisposable)
        newsDataSourceLiveData.postValue(mNewsDataSource)
        return mNewsDataSource
    }
}