package com.bapidas.news.di.module

import com.bapidas.news.receiver.DemoReceiver
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ReceiverBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeDemoReceiver(): DemoReceiver
}