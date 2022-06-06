package com.bapidas.news.headlines.detail

import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.appcore.activity.BaseActivityModule
import com.bapidas.news.appcore.di.key.ActivityViewModelKey
import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseActivityModule::class, NewsDetailFragmentBuilder::class])
abstract class NewsDetailActivityModule {
    @Binds
    @ActivityScope
    abstract fun bindActivity(activity: NewsDetailsActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ActivityViewModelKey(NewsDetailViewModel::class)
    @ActivityScope
    abstract fun bindViewModel(viewModel: NewsDetailViewModel): BaseActivityViewModel
}