package com.bapidas.news.main

import com.bapidas.news.R
import com.bapidas.news.appcore.activity.BaseDataBindingActivity
import com.bapidas.news.databinding.ActivityMainBinding
import com.bapidas.news.di.AppComponentProvider
import com.bapidas.news.headlines.listing.NewsActivity

class MainActivity :
    BaseDataBindingActivity<ActivityMainBinding, MainViewModel, AppComponentProvider>() {
    override val layoutViewRes: Int = R.layout.activity_main

    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java

    override fun onViewCreated() {
        super.onViewCreated()
        NewsActivity.openClear(this)
    }

    override fun diInjection(component: AppComponentProvider) {
        component.provideAppComponent().newMainActivitySubComponent().inject(this)
    }
}