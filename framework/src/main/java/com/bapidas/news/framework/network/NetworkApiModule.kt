package com.bapidas.news.framework.network

import com.bapidas.news.framework.network.api.IRemoteNewsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkApiModule {
    @Provides
    fun provideAuthenticationApi(retrofit: Retrofit): IRemoteNewsApi =
        retrofit.create(IRemoteNewsApi::class.java)
}