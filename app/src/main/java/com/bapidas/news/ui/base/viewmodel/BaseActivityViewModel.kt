package com.bapidas.news.ui.base.viewmodel

import android.content.Intent

abstract class BaseActivityViewModel : BaseViewModel() {
    open fun handleIntent(intent: Intent) {}
}