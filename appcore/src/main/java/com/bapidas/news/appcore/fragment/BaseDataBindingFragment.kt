package com.bapidas.news.appcore.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.bapidas.news.appcore.BR
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import timber.log.Timber

abstract class BaseDataBindingFragment<
        D : ViewDataBinding,
        V : BaseFragmentViewModel,
        C : BaseComponentProvider> : BaseFragment<V, C>() {
    @get:LayoutRes
    protected abstract val layoutViewRes: Int

    private lateinit var _binding: D

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //create data binding layout and set view model
        _binding = DataBindingUtil.inflate(inflater, layoutViewRes, container, false)
        _binding.setVariable(BR.viewModel, viewModel)
        _binding.lifecycleOwner = this
        onViewCreated()
        return _binding.root
    }

    @CallSuper
    protected open fun onViewCreated() {
        Timber.v("onViewCreated")
    }
}