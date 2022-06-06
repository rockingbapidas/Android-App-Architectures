package com.bapidas.news.headlines.worker

import android.content.Context
import androidx.work.WorkerParameters
import com.bapidas.news.appcore.worker.BaseWorker
import com.bapidas.news.appcore.worker.IWorkerFactory
import javax.inject.Inject

class HeadlinesDemoWorker(
    private val appContext: Context,
    private val workerParameters: WorkerParameters
) : BaseWorker(appContext, workerParameters) {
    override suspend fun doWork(): Result {
        TODO("Not yet implemented")
    }

    class Factory @Inject constructor() : IWorkerFactory<HeadlinesDemoWorker> {
        override fun create(appContext: Context, params: WorkerParameters): HeadlinesDemoWorker {
            return HeadlinesDemoWorker(appContext, params)
        }
    }
}