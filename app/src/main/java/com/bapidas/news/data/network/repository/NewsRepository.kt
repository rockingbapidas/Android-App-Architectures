package com.bapidas.news.data.network.repository

import androidx.paging.DataSource
import androidx.paging.ItemKeyedDataSource
import com.bapidas.news.ui.model.Article

interface NewsRepository {
    fun getNewsArticles(): DataSource.Factory<Int, Article>

    fun loadNewsArticles(
        page: Int,
        latestLoad: Boolean = false,
        callback: ItemKeyedDataSource.LoadCallback<Article>? = null
    )

    fun loadMoreNewsArticles(callback: ItemKeyedDataSource.LoadCallback<Article>? = null)

    fun onCleared()
}