package com.bapidas.news.appcore.viewmodel.factory

import androidx.lifecycle.ViewModel
import com.bapidas.news.appcore.di.scope.FragmentScope
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import javax.inject.Inject
import javax.inject.Provider

@FragmentScope
class FragmentViewModelFactory @Inject constructor(
    creators: Map<Class<out BaseFragmentViewModel>,
            @JvmSuppressWildcards Provider<BaseFragmentViewModel>>
) :
    BaseViewModelFactory(creators as Map<Class<out ViewModel>, Provider<ViewModel>>)