package com.bapidas.news.domain

import com.bapidas.news.domain.model.NewsListDomain

interface INewsRepository {
    suspend fun getNews(local: Boolean, requestedLoadSize: Int): NewsListDomain

    suspend fun getNewsAfter(
        local: Boolean,
        requestedLoadSize: Int,
        page: Int,
        key: String
    ): NewsListDomain

    suspend fun getNewsCount(): Int

    suspend fun saveNews(news: NewsListDomain): List<Long>

    suspend fun clearNews(): Int
}