package com.bapidas.news.framework.network.repository

import com.bapidas.news.data.model.NewsListEntity
import com.bapidas.news.data.repository.INewsRemoteRepository
import com.bapidas.news.framework.network.api.IRemoteNewsApi
import com.bapidas.news.framework.network.mapper.fromNewsList
import javax.inject.Inject
import javax.inject.Named

class RemoteNewsRepository @Inject constructor(
    private val mRemoteNewsApi: IRemoteNewsApi,
    @Named("newsDataApiKey") private val newsDataApiKey: String
) : INewsRemoteRepository {
    override suspend fun getNews(requestedLoadSize: Int): NewsListEntity {
        return mRemoteNewsApi.fetchNewsFromServer(
            INITIAL_PAGE,
            requestedLoadSize,
            CATEGORY,
            newsDataApiKey
        ).fromNewsList()
    }

    override suspend fun getNewsAfter(requestedLoadSize: Int, page: Int): NewsListEntity {
        return mRemoteNewsApi.fetchNewsFromServer(
            page,
            requestedLoadSize,
            CATEGORY,
            newsDataApiKey
        ).fromNewsList()
    }

    companion object {
        const val INITIAL_PAGE = 1
        const val CATEGORY = "business"
    }
}