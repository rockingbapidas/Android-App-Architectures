package com.bapidas.news.appcore.di

import android.util.Log
import dagger.Module
import dagger.Provides
import timber.log.Timber
import javax.inject.Named

@Module
class TimberModule {
    @Provides
    fun provideTimberTree(@Named("enableLogs") enableLogs: Boolean): Timber.Tree =
        object : Timber.DebugTree() {
            override fun isLoggable(tag: String?, priority: Int) =
                enableLogs || priority >= Log.INFO
        }
}