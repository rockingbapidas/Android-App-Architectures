package com.bapidas.news.headlines.di

import android.app.Application
import com.bapidas.news.appcore.di.AppCoreComponent
import com.bapidas.news.appcore.di.BaseComponentProvider
import com.bapidas.news.framework.di.FrameworkComponent
import com.bapidas.news.headlines.detail.NewsDetailSubComponent
import com.bapidas.news.headlines.listing.NewsSubComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class HeadlinesScope

@HeadlinesScope
@Component(
    modules = [HeadlinesModule::class],
    dependencies = [AppCoreComponent::class, FrameworkComponent::class]
)
interface HeadlinesComponent {
    fun newNewsSubComponent(): NewsSubComponent

    fun newNewsDetailSubComponent(): NewsDetailSubComponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun core(coreComponent: AppCoreComponent): Builder

        fun framework(frameworkComponent: FrameworkComponent): Builder

        fun build(): HeadlinesComponent
    }
}

@Module
class HeadlinesModule

interface HeadlinesComponentProvider : BaseComponentProvider {
    fun provideHeadlinesComponent(): HeadlinesComponent
}