package com.bapidas.news.ui.base.activity

import androidx.databinding.ViewDataBinding
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseToolbarActivity<D : ViewDataBinding, V : BaseActivityViewModel> :
    BaseActivity<D, V>() {
    internal val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    override fun onStop() {
        super.onStop()
        compositeDisposable.clear()
    }
}