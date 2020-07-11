package com.bapidas.news.ui.base.viewmodel

import android.os.Bundle

abstract class BaseFragmentViewModel : BaseViewModel() {
    open fun handleArguments(bundle: Bundle) {}
}