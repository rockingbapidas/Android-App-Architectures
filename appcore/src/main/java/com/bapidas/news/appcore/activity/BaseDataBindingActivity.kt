package com.bapidas.news.appcore.activity

import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.bapidas.news.appcore.BR
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import timber.log.Timber

abstract class BaseDataBindingActivity<
        D : ViewDataBinding,
        V : BaseActivityViewModel,
        C : BaseComponentProvider> : BaseActivity<V, C>() {

    @get:LayoutRes
    protected abstract val layoutViewRes: Int
    lateinit var binding: D
        private set

    override fun onViewModelCreated() {
        super.onViewModelCreated()
        //create data binding layout and set view model
        binding = DataBindingUtil.setContentView(this, layoutViewRes)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this
        onViewCreated()
    }

    @CallSuper
    protected open fun onViewCreated() {
        Timber.v("onViewCreated")
    }
}