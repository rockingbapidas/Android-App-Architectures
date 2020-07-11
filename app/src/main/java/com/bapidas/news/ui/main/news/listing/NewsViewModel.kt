package com.bapidas.news.ui.main.news.listing

import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import androidx.paging.RxPagedListBuilder
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.data.repository.NewsRepositoryImpl
import com.bapidas.news.ui.di.scope.ActivityScope
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel
import com.bapidas.news.ui.main.news.listing.paging.NewsBoundaryCallback
import com.bapidas.news.ui.main.news.listing.paging.NewsDataSourceFactory
import com.bapidas.news.ui.model.Article
import io.reactivex.Observable
import javax.inject.Inject

@ActivityScope
class NewsViewModel @Inject constructor(private val mNewsRepository: NewsRepository) :
    BaseActivityViewModel() {

    //Progress live data
    val isLoading = MutableLiveData(true)

    //Live data Paged List
    val newsArticles by lazy {
        buildDataList()
    }

    private fun buildDataList(): Observable<PagedList<Article>> {
        val mNewsDataSourceFactory by lazy {
            if (BuildConfig.LOCAL_CACHE)
                mNewsRepository.getNewsArticles()
            else
                NewsDataSourceFactory(mNewsRepository, compositeDisposable)
        }
        val mPagedListConfig by lazy {
            PagedList.Config.Builder()
                .setPageSize(NewsRepositoryImpl.PAGE_SIZE)
                .setEnablePlaceholders(false)
                .setPrefetchDistance(5)
                .build()
        }
        return if (BuildConfig.LOCAL_CACHE) {
            RxPagedListBuilder(mNewsDataSourceFactory, mPagedListConfig)
                .setBoundaryCallback(NewsBoundaryCallback(mNewsRepository, compositeDisposable))
                .buildObservable()
        } else {
            RxPagedListBuilder(mNewsDataSourceFactory, mPagedListConfig)
                .buildObservable()
        }
    }
}