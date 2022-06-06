package com.bapidas.news.framework.network.repository

import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.repository.NewsRemoteRepository
import com.bapidas.news.framework.BuildConfig
import com.bapidas.news.framework.network.api.RemoteNewsApi
import com.bapidas.news.framework.network.mapper.fromNewsList

class RemoteNewsRepository(private val mRemoteNewsApi: RemoteNewsApi) : NewsRemoteRepository {
    override suspend fun getNews(requestedLoadSize: Int): NewsListEntity {
        return mRemoteNewsApi.fetchNewsFromServer(
            INITIAL_PAGE,
            requestedLoadSize,
            CATEGORY,
            BuildConfig.API_KEY
        ).fromNewsList()
    }

    override suspend fun getNewsAfter(requestedLoadSize: Int, page: Int): NewsListEntity {
        return mRemoteNewsApi.fetchNewsFromServer(
            page,
            requestedLoadSize,
            CATEGORY,
            BuildConfig.API_KEY
        ).fromNewsList()
    }

    companion object {
        const val INITIAL_PAGE = 1
        const val CATEGORY = "business"
    }
}