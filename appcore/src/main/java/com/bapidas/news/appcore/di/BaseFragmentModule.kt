package com.bapidas.news.appcore.di

import androidx.lifecycle.ViewModelProvider
import com.bapidas.news.appcore.viewmodel.factory.FragmentViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class BaseFragmentModule {
    @Binds
    @FragmentScope
    @FragmentContext
    abstract fun bindViewModelFactory(viewModelFactory: FragmentViewModelFactory): ViewModelProvider.Factory
}
