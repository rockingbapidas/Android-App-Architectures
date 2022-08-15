package com.bapidas.news.headlines.detail

import androidx.appcompat.app.AppCompatActivity
import com.bapidas.news.appcore.di.ActivityScope
import com.bapidas.news.appcore.di.ActivityViewModelKey
import com.bapidas.news.appcore.di.BaseActivityModule
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import com.bapidas.news.headlines.detail.browser.NewsBrowserSubComponent
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.multibindings.IntoMap

@ActivityScope
@Subcomponent(modules = [NewsDetailActivityModule::class])
interface NewsDetailSubComponent {
    fun inject(newsDetailsActivity: NewsDetailsActivity)

    fun newNewsBrowserSubComponent(): NewsBrowserSubComponent
}

@Module(includes = [BaseActivityModule::class])
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

interface NewsDetailSubComponentProvider : BaseComponentProvider {
    fun provideNewsDetailSubComponent(): NewsDetailSubComponent
}