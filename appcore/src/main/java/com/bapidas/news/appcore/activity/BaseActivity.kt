package com.bapidas.news.appcore.activity

import android.content.Intent
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.appcore.di.ActivityContext
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import timber.log.Timber
import javax.inject.Inject

abstract class BaseActivity<V : BaseActivityViewModel, C : BaseComponentProvider> :
    AppCompatActivity() {

    @Inject
    @field:ActivityContext
    protected lateinit var viewModelProviderFactory: ViewModelProvider.Factory

    protected abstract val viewModelClass: Class<V>
    lateinit var viewModel: V
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        diInjection(applicationContext as C)
        super.onCreate(savedInstanceState)

        //create view model
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(viewModelClass)
        viewModel.handleCreate()
        viewModel.handleIntent(intent)
        onViewModelCreated()
    }

    abstract fun diInjection(component: C)

    @CallSuper
    protected open fun onViewModelCreated() {
        Timber.v("onViewModelCreated")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        viewModel.handleIntent(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
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
}
