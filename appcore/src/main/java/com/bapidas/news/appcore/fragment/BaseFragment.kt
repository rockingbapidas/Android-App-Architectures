package com.bapidas.news.appcore.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.appcore.BR
import com.bapidas.news.appcore.di.qualifier.FragmentContext
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<D : ViewDataBinding, V : BaseFragmentViewModel> : Fragment(),
    HasAndroidInjector {
    @Inject
    protected lateinit var childFragmentInjector: DispatchingAndroidInjector<Any>

    @get:LayoutRes
    protected abstract val layoutViewRes: Int

    @Inject
    @field:FragmentContext
    protected lateinit var viewModelProvider: ViewModelProvider

    protected abstract val viewModelClass: Class<V>

    lateinit var viewModel: V
        private set

    private lateinit var _binding: D

    override fun androidInjector(): AndroidInjector<Any> {
        return childFragmentInjector
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //create view model
        viewModel = viewModelProvider.get(viewModelClass)
        viewModel.handleCreate()
        arguments?.let { viewModel.handleArguments(it) }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //create data binding layout and set view model
        _binding = DataBindingUtil.inflate(inflater, layoutViewRes, container, false)
        _binding.setVariable(BR.viewModel, viewModel)
        _binding.lifecycleOwner = this
        return _binding.root
    }

    @CallSuper
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        viewModel.handleResult(requestCode, resultCode, data)
    }

    @CallSuper
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        viewModel.handlePermissionResult(requestCode, permissions, grantResults)
    }

    override fun onResume() {
        super.onResume()
        viewModel.handleResume()
    }

    override fun onPause() {
        super.onPause()
        viewModel.handlePause()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        savedInstanceState?.let { viewModel.handleRestoreInstanceState(it) }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        viewModel.handleSaveInstanceState(outState)
    }
}