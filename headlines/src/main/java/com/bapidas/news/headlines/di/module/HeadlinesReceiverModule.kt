package com.bapidas.news.headlines.di.module

import com.bapidas.news.headlines.receiver.HeadlinesDemoReceiver
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class HeadlinesReceiverModule {
    @ContributesAndroidInjector
    abstract fun contributeHeadlinesDemoReceiver(): HeadlinesDemoReceiver
}