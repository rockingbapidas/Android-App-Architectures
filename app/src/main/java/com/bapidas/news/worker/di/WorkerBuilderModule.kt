package com.bapidas.news.worker.di

import androidx.work.ListenableWorker
import com.bapidas.news.worker.DemoWorker
import com.bapidas.news.worker.base.IWorkerFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class WorkerBuilderModule {
    @Binds
    @IntoMap
    @WorkerKey(DemoWorker::class)
    abstract fun bindDemoWorker(worker: DemoWorker.Factory): IWorkerFactory<out ListenableWorker>
}