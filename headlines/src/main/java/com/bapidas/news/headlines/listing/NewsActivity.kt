package com.bapidas.news.headlines.listing

import android.app.Activity
import android.content.Intent
import android.os.Handler
import android.view.View
import androidx.lifecycle.Observer
import com.bapidas.news.appcore.activity.BaseActivity
import com.bapidas.news.appcore.adapter.callback.ItemViewListener
import com.bapidas.news.appcore.adapter.recycler.decoration.VerticalSpaceItemDecoration
import com.bapidas.news.appcore.extensions.dp
import com.bapidas.news.headlines.R
import com.bapidas.news.headlines.databinding.ActivityNewsBinding
import com.bapidas.news.headlines.detail.NewsDetailsActivity
import com.bapidas.news.headlines.listing.adapter.NewsAdapter
import com.bapidas.news.headlines.model.Article
import kotlinx.android.synthetic.main.activity_news.*
import timber.log.Timber

class NewsActivity : BaseActivity<ActivityNewsBinding, NewsViewModel>(), ItemViewListener {
    override val layoutViewRes: Int = R.layout.activity_news

    override val viewModelClass: Class<NewsViewModel> = NewsViewModel::class.java

    private val newsAdapter by lazy { NewsAdapter(this) }

    override fun onViewModelCreated() {
        super.onViewModelCreated()
        viewModel.newsArticles.observe(this, Observer {
            Timber.e("newsArticles %s", it.loadedCount)
            if (it.isNotEmpty()) viewModel.isLoading.value = false
            newsAdapter.submitList(it)
        })

        Handler().postDelayed({
            viewModel.newsArticles.removeObservers(this)
            viewModel.newsArticles.observe(this, Observer {
                Timber.e("newsArticles %s", it.loadedCount)
                if (it.isNotEmpty()) viewModel.isLoading.value = false
                newsAdapter.submitList(it)
            })
        }, 2000)
    }

    override fun onViewCreated() {
        super.onViewCreated()
        rv_news.apply {
            adapter = newsAdapter
            addItemDecoration(VerticalSpaceItemDecoration(48.dp))
        }
    }

    override fun onItemClick(v: View, `object`: Any) {
        NewsDetailsActivity.open(v, `object` as Article, this)
    }

    companion object {
        fun openClear(fromActivity: Activity) {
            val intent = Intent(fromActivity, NewsActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            fromActivity.startActivity(intent)
            fromActivity.finish()
        }
    }
}