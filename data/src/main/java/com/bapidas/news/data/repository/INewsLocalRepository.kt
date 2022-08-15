package com.bapidas.news.data.repository

import com.bapidas.news.data.model.NewsListEntity

interface INewsLocalRepository {
    suspend fun getNews(requestedLoadSize: Int): NewsListEntity

    suspend fun getNewsAfter(requestedLoadSize: Int, key: String): NewsListEntity

    suspend fun getNewsCount(): Int

    suspend fun saveNews(newsListEntity: NewsListEntity): List<Long>

    suspend fun clearNews(): Int
}