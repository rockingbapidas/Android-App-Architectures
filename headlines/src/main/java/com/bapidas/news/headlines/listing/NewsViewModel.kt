package com.bapidas.news.headlines.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import com.bapidas.news.framework.interactions.NewsInteractions
import com.bapidas.news.headlines.listing.paging.NewsDataSourceFactory
import com.bapidas.news.headlines.model.Article
import javax.inject.Inject

@ActivityScope
class NewsViewModel @Inject constructor(
    private val mNewsInteractions: NewsInteractions
) : BaseActivityViewModel() {

    //Progress live data
    val isLoading = MutableLiveData(true)

    //Live data Paged List
    val newsArticles by lazy { buildLiveDataList() }

    private fun buildLiveDataList(): LiveData<PagedList<Article>> {
        val mPagedListConfig by lazy {
            PagedList.Config.Builder()
                .setPageSize(20)
                .setEnablePlaceholders(false)
                .setPrefetchDistance(5)
                .build()
        }
        val mDataSourceFactory = NewsDataSourceFactory(mNewsInteractions, viewModelScope)
        return LivePagedListBuilder(mDataSourceFactory, mPagedListConfig).build()
    }
}