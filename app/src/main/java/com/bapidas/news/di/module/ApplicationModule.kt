package com.bapidas.news.di.module

import android.app.Application
import android.content.Context
import com.bapidas.news.NewsApplication
import com.bapidas.news.di.module.provide.*
import com.bapidas.news.di.qualifier.ApplicationContext
import com.bapidas.news.receiver.di.ReceiverBuilderModule
import com.bapidas.news.service.di.ServiceBuilderModule
import com.bapidas.news.ui.di.ActivityBuilderModule
import com.bapidas.news.worker.di.WorkerBuilderModule
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule

@Module(
    includes = [AndroidInjectionModule::class,
        ActivityBuilderModule::class,
        ServiceBuilderModule::class,
        ReceiverBuilderModule::class,
        WorkerBuilderModule::class,
        TimberModule::class,
        RoomModule::class,
        RxJavaModule::class,
        NetworkModule::class,
        ApiModule::class
    ]
)
abstract class ApplicationModule {
    @Binds
    abstract fun bindApplication(application: NewsApplication): Application

    @Binds
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}
