package com.bapidas.news.data.factory

import com.bapidas.news.data.store.NewsDataStore
import com.bapidas.news.data.store.NewsLocalDataStore
import com.bapidas.news.data.store.NewsRemoteDataStore

class NewsDataStoreFactory constructor(
    private val mNewsLocalDataStore: NewsLocalDataStore,
    private val mNewsRemoteDataStore: NewsRemoteDataStore
) {

    fun retrieveDataStore(local: Boolean): NewsDataStore {
        return if (local)
            retrieveLocalDataStore()
        else
            retrieveRemoteDataStore()
    }

    /**
     * Return an instance of the Cache Data Store
     */
    fun retrieveLocalDataStore(): NewsDataStore {
        return mNewsLocalDataStore
    }

    /**
     * Return an instance of the Remote Data Store
     */
    fun retrieveRemoteDataStore(): NewsDataStore {
        return mNewsRemoteDataStore
    }
}