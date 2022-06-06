package com.bapidas.news.headlines.di.module

import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.headlines.detail.NewsDetailActivityModule
import com.bapidas.news.headlines.detail.NewsDetailsActivity
import com.bapidas.news.headlines.listing.NewsActivity
import com.bapidas.news.headlines.listing.NewsActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class HeadlinesActivityModule {
    @ContributesAndroidInjector(modules = [NewsActivityModule::class])
    @ActivityScope
    abstract fun contributeNewsActivity(): NewsActivity

    @ContributesAndroidInjector(modules = [NewsDetailActivityModule::class])
    @ActivityScope
    abstract fun contributeNewsDetailsActivity(): NewsDetailsActivity
}
