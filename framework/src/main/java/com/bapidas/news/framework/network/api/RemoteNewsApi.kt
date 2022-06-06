package com.bapidas.news.framework.network.api

import com.bapidas.news.framework.network.entity.NewsList
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteNewsApi {
    @GET(Urls.News.ARTICLES_API)
    suspend fun fetchNewsFromServer(
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int,
        @Query("q") category: String,
        @Query("apiKey") apiKey: String
    ): NewsList
}