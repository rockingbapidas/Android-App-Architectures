package com.bapidas.news.main

import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.appcore.di.ActivityScope
import com.bapidas.news.appcore.di.ActivityViewModelKey
import com.bapidas.news.appcore.di.BaseActivityModule
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import com.bapidas.news.headlines.listing.NewsSubModule
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.multibindings.IntoMap

@ActivityScope
@Subcomponent(modules = [NewsSubModule::class])
interface MainActivitySubComponent {
    fun inject(mainActivity: MainActivity)
}

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
    @Binds
    @ActivityScope
    abstract fun bindActivity(activity: MainActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ActivityViewModelKey(MainViewModel::class)
    @ActivityScope
    abstract fun bindViewModel(viewModel: MainViewModel): BaseActivityViewModel
}