package com.bapidas.news.service.di

import com.bapidas.news.service.DemoService
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ServiceBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeDemoService(): DemoService
}