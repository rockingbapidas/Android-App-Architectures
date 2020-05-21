package com.bapidas.news.di.module.inject

import com.bapidas.news.di.scope.ActivityScope
import com.bapidas.news.ui.main.MainActivity
import com.bapidas.news.ui.main.MainActivityModule
import com.bapidas.news.ui.main.news.detail.NewsDetailActivityModule
import com.bapidas.news.ui.main.news.detail.NewsDetailsActivity
import com.bapidas.news.ui.main.news.listing.NewsActivity
import com.bapidas.news.ui.main.news.listing.NewsActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [NewsActivityModule::class])
    @ActivityScope
    abstract fun contributeNewsActivity(): NewsActivity

    @ContributesAndroidInjector(modules = [NewsDetailActivityModule::class])
    @ActivityScope
    abstract fun contributeNewsDetailsActivity(): NewsDetailsActivity
}
