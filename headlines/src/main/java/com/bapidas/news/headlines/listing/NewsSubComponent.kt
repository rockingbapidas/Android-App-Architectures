package com.bapidas.news.headlines.listing

import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.appcore.di.ActivityScope
import com.bapidas.news.appcore.di.ActivityViewModelKey
import com.bapidas.news.appcore.di.BaseActivityModule
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.multibindings.IntoMap

@ActivityScope
@Subcomponent(modules = [NewsSubModule::class])
interface NewsSubComponent {
    fun inject(newsActivity: NewsActivity)
}

@Module(includes = [BaseActivityModule::class])
interface NewsSubModule {
    @Binds
    @ActivityScope
    fun bindActivity(activity: NewsActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ActivityScope
    @ActivityViewModelKey(NewsViewModel::class)
    fun bindViewModel(viewModel: NewsViewModel): BaseActivityViewModel
}