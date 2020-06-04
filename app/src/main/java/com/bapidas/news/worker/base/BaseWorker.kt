package com.bapidas.news.worker.base

import android.content.Context
import androidx.work.RxWorker
import androidx.work.WorkerParameters

abstract class BaseWorker(appContext: Context, workerParameters: WorkerParameters) :
    RxWorker(appContext, workerParameters)