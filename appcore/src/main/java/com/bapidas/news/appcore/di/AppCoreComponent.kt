package com.bapidas.news.appcore.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import timber.log.Timber
import javax.inject.Named

@AppCoreScope
@Component(modules = [AppCoreModule::class, TimberModule::class])
interface AppCoreComponent {
    fun timberTree(): Timber.Tree

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance @Named("enableLogs") enableLogs: Boolean,
            @BindsInstance @Named("isProdEnvironment") isProdEnvironment: Boolean
        ): AppCoreComponent
    }
}