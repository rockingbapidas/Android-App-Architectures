package com.bapidas.news.framework.db

import com.bapidas.news.framework.db.dao.IRoomNewsDao
import dagger.Module
import dagger.Provides

@Module
class CacheApiModule {
    @Provides
    fun providesSampleDao(
        appDatabase: AppDatabase
    ): IRoomNewsDao = appDatabase.roomNewsDao()
}