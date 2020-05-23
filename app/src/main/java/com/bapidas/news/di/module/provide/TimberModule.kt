package com.bapidas.news.di.module.provide

import android.util.Log
import com.bapidas.news.BuildConfig
import dagger.Module
import dagger.Provides
import timber.log.Timber

@Module
class TimberModule {
    @Provides
    fun provideTimberTree(): Timber.Tree = object : Timber.DebugTree() {
        override fun isLoggable(tag: String?, priority: Int) =
            BuildConfig.DEBUG || priority >= Log.INFO
    }
}