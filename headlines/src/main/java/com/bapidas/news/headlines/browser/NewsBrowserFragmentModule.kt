package com.bapidas.news.headlines.browser

import androidx.fragment.app.Fragment
import com.bapidas.news.appcore.di.key.FragmentViewModelKey
import com.bapidas.news.appcore.di.scope.FragmentScope
import com.bapidas.news.appcore.fragment.BaseFragmentModule
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseFragmentModule::class])
abstract class NewsBrowserFragmentModule {
    @Binds
    @FragmentScope
    abstract fun bindFragment(fragment: NewsBrowserFragment): Fragment

    @Binds
    @IntoMap
    @FragmentViewModelKey(NewsBrowserViewModel::class)
    @FragmentScope
    abstract fun bindViewModel(viewModel: NewsBrowserViewModel): BaseFragmentViewModel
}