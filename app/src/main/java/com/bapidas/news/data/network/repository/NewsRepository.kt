package com.bapidas.news.data.network.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.bapidas.news.data.db.model.Article

interface NewsRepository {
    fun getNewsArticles(): LiveData<PagedList<Article>>

    fun loadNewsArticles(page: Int, latestLoad: Boolean = false)

    fun loadNewsArticles()

    fun onCleared()
}