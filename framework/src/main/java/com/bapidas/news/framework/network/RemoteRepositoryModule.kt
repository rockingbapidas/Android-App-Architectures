package com.bapidas.news.framework.network

import com.bapidas.news.data.repository.INewsRemoteRepository
import com.bapidas.news.framework.network.repository.RemoteNewsRepository
import dagger.Binds
import dagger.Module

@Module
interface RemoteRepositoryModule {
    @Binds
    fun bindRemoteNewsRepository(
        remoteNewsRepository: RemoteNewsRepository
    ): INewsRemoteRepository
}