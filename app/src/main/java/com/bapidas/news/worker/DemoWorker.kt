package com.bapidas.news.worker

import android.content.Context
import androidx.work.WorkerParameters
import com.bapidas.news.worker.base.BaseWorker
import com.bapidas.news.worker.base.IWorkerFactory
import io.reactivex.Single
import javax.inject.Inject

class DemoWorker(
    private val appContext: Context,
    private val workerParameters: WorkerParameters
) : BaseWorker(appContext, workerParameters) {
    override fun createWork(): Single<Result> {
        TODO("Not yet implemented")
    }

    class Factory @Inject constructor() : IWorkerFactory<DemoWorker> {
        override fun create(appContext: Context, params: WorkerParameters): DemoWorker {
            return DemoWorker(appContext, params)
        }
    }
}