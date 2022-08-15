package com.bapidas.news.appcore.fragment

import android.content.Intent
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.appcore.di.FragmentContext
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import javax.inject.Inject

abstract class BaseFragment<V : BaseFragmentViewModel, C : BaseComponentProvider> : Fragment() {
    @Inject
    @field:FragmentContext
    protected lateinit var viewModelProviderFactory: ViewModelProvider.Factory

    protected abstract val viewModelClass: Class<V>

    lateinit var viewModel: V
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diInjection(activity as C)

        //create view model
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(viewModelClass)
        viewModel.handleCreate()
        arguments?.let { viewModel.handleArguments(it) }
    }

    @Deprecated("Deprecated in Java")
    @CallSuper
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        viewModel.handleResult(requestCode, resultCode, data)
    }

    @Deprecated("Deprecated in Java")
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

    abstract fun diInjection(componentProvider: C)
}