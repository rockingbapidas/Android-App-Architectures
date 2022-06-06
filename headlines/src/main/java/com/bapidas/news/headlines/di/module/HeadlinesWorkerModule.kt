package com.bapidas.news.headlines.di.module

import androidx.work.ListenableWorker
import com.bapidas.news.appcore.di.key.WorkerKey
import com.bapidas.news.appcore.worker.IWorkerFactory
import com.bapidas.news.headlines.worker.HeadlinesDemoWorker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class HeadlinesWorkerModule {
    @Binds
    @IntoMap
    @WorkerKey(HeadlinesDemoWorker::class)
    abstract fun bindHeadlinesDemoWorker(worker: HeadlinesDemoWorker.Factory): IWorkerFactory<out ListenableWorker>
}