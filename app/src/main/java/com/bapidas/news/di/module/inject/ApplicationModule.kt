package com.bapidas.news.di.module.inject

import android.app.Application
import android.content.Context
import com.bapidas.news.NewsApplication
import com.bapidas.news.di.module.provide.*
import com.bapidas.news.di.qualifier.ApplicationContext
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
