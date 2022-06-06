package com.bapidas.news.di.module

import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.main.MainActivity
import com.bapidas.news.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    abstract fun contributeMainActivity(): MainActivity
}
