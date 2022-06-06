package com.bapidas.news.appcore.viewmodel

import android.os.Bundle

abstract class BaseFragmentViewModel : BaseViewModel() {
    open fun handleArguments(bundle: Bundle) {}
}