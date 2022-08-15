package com.bapidas.news.data

import com.bapidas.news.domain.NewsDataInteraction
import dagger.Subcomponent

@DataScope
@Subcomponent(modules = [DataModule::class])
interface DataSubComponent {
    fun newsDataInteraction(): NewsDataInteraction
}