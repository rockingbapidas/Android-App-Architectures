package com.bapidas.news.di.module.provide

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

@Module
class RxJavaModule {
    @Provides
    @Named(SUBCRIBER_ON)
    @Singleton
    fun provideSubscriberOn(): Scheduler = Schedulers.io()

    @Provides
    @Named(OBSERVER_ON)
    @Singleton
    fun provideObserverOn(): Scheduler = AndroidSchedulers.mainThread()

    companion object {
        const val SUBCRIBER_ON = "SubscribeOn"
        const val OBSERVER_ON = "ObserverOn"
    }
}