package com.bapidas.news.framework.di

import android.app.Application
import android.content.Context
import com.bapidas.news.framework.di.module.*
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        TimberModule::class,
        NetworkModule::class,
        RoomModule::class,
        ApiModule::class,
        InteractionsModule::class
    ]
)
abstract class FrameworkModule {
    @Binds
    abstract fun bindApplicationContext(application: Application): Context
}