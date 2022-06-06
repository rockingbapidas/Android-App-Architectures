package com.bapidas.news.data.repository

import com.bapidas.news.data.model.NewsListEntity

interface NewsRemoteRepository {
    suspend fun getNews(requestedLoadSize: Int): NewsListEntity

    suspend fun getNewsAfter(requestedLoadSize: Int, page: Int): NewsListEntity
}