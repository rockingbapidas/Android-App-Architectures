package com.bapidas.news

import android.util.Log
import androidx.work.WorkManager
import com.bapidas.news.appcore.worker.WorkerInjectorFactory
import com.bapidas.news.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber
import java.util.concurrent.Executors
import javax.inject.Inject

class NewsApplication : DaggerApplication() {
    @Inject
    lateinit var timberTree: Timber.Tree

    @Inject
    lateinit var workerInjectorFactory: WorkerInjectorFactory

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(timberTree)
        configureWorkManager()
    }

    private fun configureWorkManager() {
        val config = androidx.work.Configuration.Builder()
            .setMinimumLoggingLevel(Log.VERBOSE)
            .setTaskExecutor(Executors.newCachedThreadPool())
            .setExecutor(Executors.newCachedThreadPool())
            .setWorkerFactory(workerInjectorFactory)
            .build()
        WorkManager.initialize(this, config)
    }
}