package com.bapidas.news.headlines.detail

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import com.bapidas.news.appcore.di.scope.ActivityScope
import com.bapidas.news.appcore.viewmodel.BaseActivityViewModel
import com.bapidas.news.headlines.model.Article
import javax.inject.Inject

@ActivityScope
class NewsDetailViewModel @Inject constructor() :
    BaseActivityViewModel() {
    val article = MutableLiveData<Article>()

    override fun handleIntent(intent: Intent) {
        super.handleIntent(intent)
        intent.extras?.apply {
            article.value = getSerializable(NewsDetailsActivity.NEWS_EXTRA_DATA) as Article
        }
    }
}