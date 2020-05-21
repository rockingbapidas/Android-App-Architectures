package com.bapidas.news.ui.main

import com.bapidas.news.R
import com.bapidas.news.databinding.ActivityMainBinding
import com.bapidas.news.ui.base.activity.BaseToolbarActivity
import com.bapidas.news.ui.main.news.listing.NewsActivity

class MainActivity : BaseToolbarActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutViewRes: Int = R.layout.activity_main

    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java

    override fun onViewCreated() {
        super.onViewCreated()
        NewsActivity.openClear(this)
    }
}