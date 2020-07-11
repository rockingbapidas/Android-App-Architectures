package com.bapidas.news.ui.base.viewmodel

import android.content.Intent
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

    internal val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    open fun handleCreate() {}

    open fun handleResult(requestCode: Int, resultCode: Int, data: Intent?) {}

    open fun handlePermissionResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
    }

    open fun handleResume() {}

    open fun handlePause() {}

    @CallSuper
    open fun handleRestoreInstanceState(savedInstanceState: Bundle) {
    }

    @CallSuper
    open fun handleSaveInstanceState(outState: Bundle) {
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}