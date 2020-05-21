package com.bapidas.news.ui.main.news.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.bapidas.news.data.repository.NewsRepository
import com.bapidas.news.di.scope.ActivityScope
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel
import com.bapidas.news.ui.model.Article
import javax.inject.Inject

@ActivityScope
class NewsViewModel @Inject constructor(private val mNewsRepository: NewsRepository) :
    BaseActivityViewModel() {
    val newsArticles: LiveData<PagedList<Article>> by lazy { mNewsRepository.getNewsArticles() }
    val isLoading = MutableLiveData(true)

    override fun onCleared() {
        super.onCleared()
        mNewsRepository.onCleared()
    }
}