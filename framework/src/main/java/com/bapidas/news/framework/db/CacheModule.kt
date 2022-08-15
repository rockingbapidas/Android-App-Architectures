package com.bapidas.news.framework.db

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [CacheApiModule::class, CacheRepositoryModule::class])
class CacheModule {
    @Provides
    fun providesAppDatabase(
        context: Context,
        @Named("databaseName") databaseName: String,
        @Named("databaseVersion") databaseVersion: Int
    ): AppDatabase = AppDatabase.getInstance(context, databaseName, databaseVersion)

    @Provides
    fun providesAppDataStore(
        @Named("storeName") storeName: String,
        @Named("storeVersion") storeVersion: Int
    ): AppDataStore = AppDataStore.getInstance(storeName, storeVersion)
}