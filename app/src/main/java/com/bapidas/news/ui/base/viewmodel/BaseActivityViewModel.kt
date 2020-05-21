package com.bapidas.news.ui.base.viewmodel

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

abstract class BaseActivityViewModel : BaseViewModel() {
    protected val executor: ExecutorService = Executors.newCachedThreadPool()
}