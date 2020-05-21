package com.bapidas.news.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.bapidas.news.ui.model.Article

interface NewsRepository {
    fun getNewsArticles(): LiveData<PagedList<Article>>

    fun onCleared()
}