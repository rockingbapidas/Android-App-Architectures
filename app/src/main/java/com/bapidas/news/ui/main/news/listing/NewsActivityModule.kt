package com.bapidas.news.ui.main.news.listing

import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.di.key.ActivityViewModelKey
import com.bapidas.news.di.scope.ActivityScope
import com.bapidas.news.ui.base.activity.BaseActivityModule
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseActivityModule::class])
abstract class NewsActivityModule {
    @Binds
    @ActivityScope
    abstract fun bindActivity(activity: NewsActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ActivityViewModelKey(NewsViewModel::class)
    @ActivityScope
    abstract fun bindViewModel(viewModel: NewsViewModel): BaseActivityViewModel
}