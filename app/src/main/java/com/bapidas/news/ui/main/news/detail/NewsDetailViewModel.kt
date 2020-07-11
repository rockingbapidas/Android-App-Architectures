package com.bapidas.news.ui.main.news.detail

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import com.bapidas.news.ui.di.scope.ActivityScope
import com.bapidas.news.ui.base.viewmodel.BaseActivityViewModel
import com.bapidas.news.ui.model.Article
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