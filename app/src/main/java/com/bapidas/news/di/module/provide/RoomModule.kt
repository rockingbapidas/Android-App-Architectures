package com.bapidas.news.di.module.provide

import android.app.Application
import com.bapidas.news.data.db.AppDatabase
import com.bapidas.news.data.db.dao.NewsArticlesDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {
    @Provides
    @Singleton
    fun providesAppDatabase(application: Application): AppDatabase =
        AppDatabase.getInstance(application)

    @Singleton
    @Provides
    fun providesNewsDao(appDatabase: AppDatabase): NewsArticlesDao = appDatabase.newsArticlesDao()
}