package com.bapidas.news.di.module.inject

import android.app.Application
import android.content.Context
import com.bapidas.news.NewsApplication
import com.bapidas.news.di.module.provide.*
import com.bapidas.news.di.qualifier.ApplicationContext
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Module(
    includes = [AndroidInjectionModule::class, ActivityBuilderModule::class,
        TimberModule::class, RxJavaModule::class, NetworkModule::class,
        ApiModule::class, RoomModule::class]
)
abstract class ApplicationModule {
    @Binds
    @Singleton
    abstract fun bindApplication(application: NewsApplication): Application

    @Binds
    @Singleton
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}
