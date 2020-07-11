package com.bapidas.news.ui.base.viewmodel.factory

import androidx.lifecycle.ViewModel
import com.bapidas.news.ui.di.scope.FragmentScope
import com.bapidas.news.ui.base.viewmodel.BaseFragmentViewModel
import javax.inject.Inject
import javax.inject.Provider

@FragmentScope
class FragmentViewModelFactory @Inject constructor(
    creators: Map<Class<out BaseFragmentViewModel>,
            @JvmSuppressWildcards Provider<BaseFragmentViewModel>>
) :
    BaseViewModelFactory(creators as Map<Class<out ViewModel>, Provider<ViewModel>>)