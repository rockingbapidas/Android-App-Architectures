package com.bapidas.news.headlines.di

import android.app.Application
import android.content.Context
import com.bapidas.news.appcore.di.qualifier.ApplicationContext
import com.bapidas.news.headlines.di.module.HeadlinesActivityModule
import com.bapidas.news.headlines.di.module.HeadlinesReceiverModule
import com.bapidas.news.headlines.di.module.HeadlinesServiceModule
import com.bapidas.news.headlines.di.module.HeadlinesWorkerModule
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule

@Module(
    includes = [
        AndroidInjectionModule::class,
        HeadlinesActivityModule::class,
        HeadlinesServiceModule::class,
        HeadlinesReceiverModule::class,
        HeadlinesWorkerModule::class
    ]
)
abstract class HeadlinesModule {
    @Binds
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}