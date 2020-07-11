package com.bapidas.news.ui.main.news.detail

import com.bapidas.news.ui.di.scope.FragmentScope
import com.bapidas.news.ui.main.news.detail.browser.NewsBrowserFragment
import com.bapidas.news.ui.main.news.detail.browser.NewsBrowserFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NewsDetailFragmentBuilder {
    @ContributesAndroidInjector(modules = [NewsBrowserFragmentModule::class])
    @FragmentScope
    abstract fun contributeNewsBrowserFragment(): NewsBrowserFragment
}