package com.bapidas.news.main

import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor() : BaseActivityViewModel()