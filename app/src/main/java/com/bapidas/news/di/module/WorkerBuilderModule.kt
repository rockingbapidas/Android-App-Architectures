package com.bapidas.news.di.module

import androidx.work.ListenableWorker
import com.bapidas.news.appcore.di.key.WorkerKey
import com.bapidas.news.appcore.worker.IWorkerFactory
import com.bapidas.news.worker.DemoWorker
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