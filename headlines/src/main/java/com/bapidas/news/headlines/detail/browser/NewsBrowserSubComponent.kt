package com.bapidas.news.headlines.detail.browser

import androidx.fragment.app.Fragment
import com.bapidas.news.appcore.di.BaseFragmentModule
import com.bapidas.news.appcore.di.FragmentScope
import com.bapidas.news.appcore.di.FragmentViewModelKey
import com.bapidas.news.appcore.viewmodel.BaseFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.multibindings.IntoMap

@FragmentScope
@Subcomponent(modules = [NewsBrowserFragmentModule::class])
interface NewsBrowserSubComponent {
    fun inject(newsBrowserFragment: NewsBrowserFragment)
}

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