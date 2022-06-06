package com.bapidas.news.framework.di.module

import com.bapidas.news.data.NewsRepositoryImpl
import com.bapidas.news.data.factory.NewsDataStoreFactory
import com.bapidas.news.data.store.NewsLocalDataStore
import com.bapidas.news.data.store.NewsRemoteDataStore
import com.bapidas.news.domain.usecases.*
import com.bapidas.news.framework.db.dao.RoomNewsDao
import com.bapidas.news.framework.db.repository.RoomNewsRepository
import com.bapidas.news.framework.interactions.NewsInteractions
import com.bapidas.news.framework.network.api.RemoteNewsApi
import com.bapidas.news.framework.network.repository.RemoteNewsRepository
import dagger.Module
import dagger.Provides

@Module
class InteractionsModule {
    @Provides
    fun provideNewsInteractions(
        newsRemoteApi: RemoteNewsApi,
        newsDao: RoomNewsDao
    ): NewsInteractions {
        val localRepository = RoomNewsRepository(newsDao)
        val remoteRepository = RemoteNewsRepository(newsRemoteApi)

        val mNewsLocalDataStore = NewsLocalDataStore(localRepository)
        val mNewsRemoteDataStore = NewsRemoteDataStore(remoteRepository)

        val mNewsDataStoreFactory = NewsDataStoreFactory(mNewsLocalDataStore, mNewsRemoteDataStore)

        val mNewsRepositoryImpl = NewsRepositoryImpl(mNewsDataStoreFactory)

        return NewsInteractions(
            SaveNews(mNewsRepositoryImpl),
            GetNews(mNewsRepositoryImpl),
            GetNewsAfter(mNewsRepositoryImpl),
            GetNewsCount(mNewsRepositoryImpl),
            ClearNews(mNewsRepositoryImpl)
        )
    }
}