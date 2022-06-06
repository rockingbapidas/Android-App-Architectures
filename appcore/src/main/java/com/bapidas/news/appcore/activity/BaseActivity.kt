package com.bapidas.news.appcore.activity

import android.content.Intent
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.appcore.BR
import com.bapidas.news.appcore.di.qualifier.ActivityContext
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

abstract class BaseActivity<D : ViewDataBinding, V : BaseActivityViewModel> : AppCompatActivity(),
    HasAndroidInjector {
    @Inject
    protected lateinit var supportFragmentInjector: DispatchingAndroidInjector<Any>

    @Inject
    @field:ActivityContext
    protected lateinit var viewModelProvider: ViewModelProvider

    @get:LayoutRes
    protected abstract val layoutViewRes: Int

    protected abstract val viewModelClass: Class<V>

    lateinit var viewModel: V
        private set

    private lateinit var binding: D

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        //create view model
        viewModel = viewModelProvider.get(viewModelClass)
        viewModel.handleCreate()
        viewModel.handleIntent(intent)
        onViewModelCreated()

        //create data binding layout and set view model
        binding = DataBindingUtil.setContentView(this, layoutViewRes)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this
        onViewCreated()
    }

    @CallSuper
    protected open fun onViewModelCreated() {
    }

    @CallSuper
    protected open fun onViewCreated() {
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        viewModel.handleIntent(intent)
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        viewModel.handleResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        viewModel.handlePermissionResult(requestCode, permissions, grantResults)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        viewModel.handleRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        viewModel.handleResume()
    }

    override fun onPause() {
        super.onPause()
        viewModel.handlePause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        viewModel.handleSaveInstanceState(outState)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return supportFragmentInjector
    }
}
