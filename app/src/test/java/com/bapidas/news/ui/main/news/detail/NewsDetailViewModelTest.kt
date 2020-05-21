package com.bapidas.news.ui.main.news.detail

import android.content.Intent
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.bapidas.news.RxImmediateSchedulerRule
import com.bapidas.news.TestUtils
import com.bapidas.news.data.model.News
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.MockitoAnnotations

class NewsDetailViewModelTest {
    @Rule
    @JvmField
    var testSchedulerRule = RxImmediateSchedulerRule()

    @Rule
    @JvmField
    val ruleForLivaData = InstantTaskExecutorRule()

    lateinit var mNewsDetailViewModel: NewsDetailViewModel
    lateinit var mGson: Gson
    lateinit var mockData: News

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mNewsDetailViewModel = NewsDetailViewModel()
        mGson = GsonBuilder().create()
        val data = TestUtils.readFromFile("/mock_object.json")
        mockData = mGson.fromJson(data, News::class.java)
    }

    @Test
    fun `Update news live data when News model received in NewsDetailViewModel`() {
        val intent = Intent().apply {
            putExtra(NewsDetailsActivity.NEWS_EXTRA_DATA, mockData)
        }

        mNewsDetailViewModel.handleIntent(intent)

        assertNotNull(mNewsDetailViewModel.news)
    }

    @Test
    fun `Update news live data when News model received null in NewsDetailViewModel`() {
        val intent = Intent()

        mNewsDetailViewModel.handleIntent(intent)

        assertNull(mNewsDetailViewModel.news.value)
    }
}