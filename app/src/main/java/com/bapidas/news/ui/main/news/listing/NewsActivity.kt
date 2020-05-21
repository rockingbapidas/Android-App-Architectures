package com.bapidas.news.ui.main.news.listing

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.lifecycle.Observer
import com.bapidas.news.R
import com.bapidas.news.common.extensions.dp
import com.bapidas.news.data.db.model.Article
import com.bapidas.news.databinding.ActivityNewsBinding
import com.bapidas.news.ui.base.activity.BaseToolbarActivity
import com.bapidas.news.ui.base.adapter.callback.ItemViewListener
import com.bapidas.news.ui.base.adapter.recycler.decoration.VerticalSpaceItemDecoration
import com.bapidas.news.ui.main.news.detail.NewsDetailsActivity
import com.bapidas.news.ui.main.news.listing.adapter.NewsAdapter
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : BaseToolbarActivity<ActivityNewsBinding, NewsViewModel>(), ItemViewListener {
    override val layoutViewRes: Int = R.layout.activity_news

    override val viewModelClass: Class<NewsViewModel> = NewsViewModel::class.java

    private val newsAdapter by lazy { NewsAdapter(this) }

    override fun onViewModelCreated() {
        super.onViewModelCreated()
        viewModel.newsArticles.observe(this, Observer {
            viewModel.isLoading.value = false
            newsAdapter.submitList(it)
        })
    }

    override fun onViewCreated() {
        super.onViewCreated()
        rv_news.apply {
            adapter = newsAdapter
            addItemDecoration(VerticalSpaceItemDecoration(48.dp))
        }
    }

    override fun onItemClick(view: View, `object`: Any) {
        NewsDetailsActivity.open(view, `object` as Article, this)
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