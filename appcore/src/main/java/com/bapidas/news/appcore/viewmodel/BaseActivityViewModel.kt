package com.bapidas.news.appcore.viewmodel

import android.content.Intent

abstract class BaseActivityViewModel : BaseViewModel() {
    open fun handleIntent(intent: Intent) {}
}