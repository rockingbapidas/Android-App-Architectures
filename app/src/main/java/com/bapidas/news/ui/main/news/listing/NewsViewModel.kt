package com.bapidas.news.ui.main.news.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.bapidas.news.BuildConfig
import com.bapidas.news.data.network.repository.NewsRepository
import com.bapidas.news.data.network.repository.NewsRepositoryImpl
import com.bapidas.news.di.scope.ActivityScope
import com.bapidas.news.ui.base.viewmodel.BaseViewModel
import com.bapidas.news.ui.main.news.listing.paging.NewsBoundaryCallback
import com.bapidas.news.ui.main.news.listing.paging.NewsDataSourceFactory
import com.bapidas.news.ui.model.Article
import javax.inject.Inject

@ActivityScope
class NewsViewModel @Inject constructor(private val mNewsRepository: NewsRepository) :
    BaseViewModel() {

    private val mNewsBoundaryCallback by lazy {
        NewsBoundaryCallback(
            mNewsRepository
        )
    }
    val isLoading = MutableLiveData(true)

    //Live data Paged List
    val newsArticles by lazy {
        buildLiveDataList()
    }

    private fun buildLiveDataList(): LiveData<PagedList<Article>> {
        val config = PagedList.Config.Builder()
            .setPageSize(NewsRepositoryImpl.PAGE_SIZE)
            .setEnablePlaceholders(false)
            .setPrefetchDistance(5)
            .build()

        return if (BuildConfig.LOCAL_CACHE) {
            val dataSourceFactory = mNewsRepository.getNewsArticles()
            LivePagedListBuilder(dataSourceFactory, config)
                .setBoundaryCallback(mNewsBoundaryCallback)
                .build()
        } else {
            val dataSourceFactory = NewsDataSourceFactory(mNewsRepository)
            LivePagedListBuilder(dataSourceFactory, config).build()
        }
    }

    override fun onCleared() {
        super.onCleared()
        mNewsRepository.onCleared()
    }
}