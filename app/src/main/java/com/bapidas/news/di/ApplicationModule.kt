package com.bapidas.news.di

import android.app.Application
import android.content.Context
import com.bapidas.news.NewsApplication
import com.bapidas.news.appcore.di.qualifier.ApplicationContext
import com.bapidas.news.di.module.ActivityBuilderModule
import com.bapidas.news.di.module.ReceiverBuilderModule
import com.bapidas.news.di.module.ServiceBuilderModule
import com.bapidas.news.di.module.WorkerBuilderModule
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule

@Module(
    includes = [
        AndroidInjectionModule::class,
        ActivityBuilderModule::class,
        ServiceBuilderModule::class,
        ReceiverBuilderModule::class,
        WorkerBuilderModule::class
    ]
)
abstract class ApplicationModule {
    @Binds
    abstract fun bindApplication(application: NewsApplication): Application

    @Binds
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}
