package com.bapidas.news.ui.main.news.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.data.repository.NewsRepositoryImpl
import com.bapidas.news.di.scope.ActivityScope
import com.bapidas.news.ui.base.viewmodel.BaseViewModel
import com.bapidas.news.ui.main.news.listing.paging.NewsBoundaryCallback
import com.bapidas.news.ui.main.news.listing.paging.NewsDataSourceFactory
import com.bapidas.news.ui.model.Article
import javax.inject.Inject

@ActivityScope
class NewsViewModel @Inject constructor(private val mNewsRepository: NewsRepository) :
    BaseViewModel() {

    private val mNewsDataSourceFactory by lazy {
        if (BuildConfig.LOCAL_CACHE)
            mNewsRepository.getNewsArticles()
        else
            NewsDataSourceFactory(mNewsRepository, compositeDisposable)
    }

    private val mPagedListConfig by lazy {
        PagedList.Config.Builder()
            .setPageSize(NewsRepositoryImpl.PAGE_SIZE)
            .setEnablePlaceholders(false)
            .setPrefetchDistance(5)
            .build()
    }

    //Progress live data
    val isLoading = MutableLiveData(true)

    //Live data Paged List
    val newsArticles by lazy {
        buildLiveDataList()
    }

    private fun buildLiveDataList(): LiveData<PagedList<Article>> {
        return if (BuildConfig.LOCAL_CACHE) {
            val mNewsBoundaryCallback = NewsBoundaryCallback(mNewsRepository, compositeDisposable)
            LivePagedListBuilder(mNewsDataSourceFactory, mPagedListConfig)
                .setBoundaryCallback(mNewsBoundaryCallback)
                .build()
        } else {
            LivePagedListBuilder(mNewsDataSourceFactory, mPagedListConfig).build()
        }
    }
}