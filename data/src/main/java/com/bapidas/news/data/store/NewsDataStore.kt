package com.bapidas.news.data.store

import com.bapidas.news.data.model.NewsListEntity

interface NewsDataStore {
    suspend fun getNews(requestedLoadSize: Int): NewsListEntity

    suspend fun getNewsAfter(requestedLoadSize: Int, page: Int, key: String): NewsListEntity

    suspend fun getNewsCount(): Int

    suspend fun saveNews(newsListEntity: NewsListEntity): List<Long>

    suspend fun clearNews(): Int
}