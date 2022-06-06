package com.bapidas.news.framework.di.module

import com.bapidas.news.framework.network.api.RemoteNewsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun provideNewsRemoteApi(
        retrofit: Retrofit
    ): RemoteNewsApi = retrofit.create(RemoteNewsApi::class.java)
}