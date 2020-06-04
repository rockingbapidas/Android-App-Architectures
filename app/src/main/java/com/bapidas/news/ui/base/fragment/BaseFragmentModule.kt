package com.handzap.handzap.ui.base.fragment

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.di.qualifier.FragmentContext
import com.bapidas.news.di.scope.FragmentScope
import com.bapidas.news.ui.base.viewmodel.factory.FragmentViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class BaseFragmentModule {
    @Binds
    @FragmentScope
    @FragmentContext
    abstract fun bindViewModelFactory(
        viewModelFactory: FragmentViewModelFactory
    ): ViewModelProvider.Factory

    @Module
    companion object {
        @Provides
        @FragmentScope
        @FragmentContext
        @JvmStatic
        fun provideViewModelProvider(
            fragment: Fragment,
            @FragmentContext viewModelFactory: ViewModelProvider.Factory
        ): ViewModelProvider = ViewModelProvider(fragment, viewModelFactory)
    }
}
