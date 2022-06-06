package com.bapidas.news.headlines.detail

import com.bapidas.news.appcore.di.scope.FragmentScope
import com.bapidas.news.headlines.browser.NewsBrowserFragment
import com.bapidas.news.headlines.browser.NewsBrowserFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NewsDetailFragmentBuilder {
    @ContributesAndroidInjector(modules = [NewsBrowserFragmentModule::class])
    @FragmentScope
    abstract fun contributeNewsBrowserFragment(): NewsBrowserFragment
}