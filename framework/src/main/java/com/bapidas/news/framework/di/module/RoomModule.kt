package com.bapidas.news.framework.di.module

import android.app.Application
import com.bapidas.news.framework.db.NewsDatabase
import com.bapidas.news.framework.db.dao.RoomNewsDao
import dagger.Module
import dagger.Provides

@Module
class RoomModule {
    @Provides
    fun providesAppDatabase(application: Application): NewsDatabase =
        NewsDatabase.getInstance(application)

    @Provides
    fun providesNewsDao(newsDatabase: NewsDatabase): RoomNewsDao =
        newsDatabase.roomNewsDao()
}