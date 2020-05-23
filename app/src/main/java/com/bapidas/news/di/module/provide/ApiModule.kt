package com.bapidas.news.di.module.provide

import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.network.remote.api.NewsApi
import com.bapidas.news.data.network.repository.NewsRepository
import com.bapidas.news.data.network.repository.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {
    @Provides
    fun provideNewsRepository(
        retrofit: Retrofit,
        newsArticlesDao: NewsArticlesDao
    ): NewsRepository {
        val newsApi = retrofit.create(NewsApi::class.java)
        return NewsRepositoryImpl(
            newsApi,
            newsArticlesDao
        )
    }
}