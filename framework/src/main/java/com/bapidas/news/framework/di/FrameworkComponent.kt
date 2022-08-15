package com.bapidas.news.framework.di

import android.content.Context
import com.bapidas.news.data.DataModule
import com.bapidas.news.domain.NewsDataInteraction
import com.bapidas.news.framework.db.CacheModule
import com.bapidas.news.framework.network.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@FrameworkScope
@Component(
    modules = [
        FrameworkModule::class,
        CacheModule::class,
        NetworkModule::class,
        DataModule::class
    ]
)
interface FrameworkComponent {

    fun newsDataInteraction(): NewsDataInteraction

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance @Named("baseUrl") baseUrl: String,
            @BindsInstance @Named("databaseName") databaseName: String,
            @BindsInstance @Named("databaseVersion") databaseVersion: Int,
            @BindsInstance @Named("storeName") storeName: String,
            @BindsInstance @Named("storeVersion") storeVersion: Int,
            @BindsInstance @Named("appName") appName: String,
            @BindsInstance @Named("appVersion") appVersion: String,
            @BindsInstance @Named("enableLogs") enableLogs: Boolean,
            @BindsInstance @Named("isProdEnvironment") isProdEnvironment: Boolean,
            @BindsInstance @Named("googleApiKey") googleApiKey: String,
            @BindsInstance @Named("newsDataApiKey") newsDataApiKey: String
        ): FrameworkComponent
    }
}