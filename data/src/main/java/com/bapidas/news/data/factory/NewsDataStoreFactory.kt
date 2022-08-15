package com.bapidas.news.data.factory

import com.bapidas.news.data.store.INewsDataStore
import com.bapidas.news.data.store.NewsLocalDataStore
import com.bapidas.news.data.store.NewsRemoteDataStore
import javax.inject.Inject

class NewsDataStoreFactory @Inject constructor(
    private val mNewsLocalDataStore: NewsLocalDataStore,
    private val mNewsRemoteDataStore: NewsRemoteDataStore
) {

    fun retrieveDataStore(local: Boolean): INewsDataStore {
        return if (local)
            retrieveLocalDataStore()
        else
            retrieveRemoteDataStore()
    }

    /**
     * Return an instance of the Cache Data Store
     */
    fun retrieveLocalDataStore(): INewsDataStore {
        return mNewsLocalDataStore
    }

    /**
     * Return an instance of the Remote Data Store
     */
    fun retrieveRemoteDataStore(): INewsDataStore {
        return mNewsRemoteDataStore
    }
}