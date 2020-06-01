package com.bapidas.news.ui.main.news.listing

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.bapidas.news.RxImmediateSchedulerRule
import com.bapidas.news.TestUtils
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.bapidas.news.data.repository.NewsRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class NewsViewModelTest {

    @Rule
    @JvmField
    var testSchedulerRule = RxImmediateSchedulerRule()

    @Rule
    @JvmField
    val ruleForLivaData = InstantTaskExecutorRule()

    @Mock
    lateinit var mNewsRepository: NewsRepository

    lateinit var mGson: Gson
    lateinit var mNewsViewModel: NewsViewModel
    lateinit var mockData: NewsListResponse

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mNewsViewModel = NewsViewModel(mNewsRepository)
        mGson = GsonBuilder().create()
        val data = TestUtils.readFromFile("/mock_response.json")
        mockData = mGson.fromJson(data, NewsListResponse::class.java)
    }

    @Test
    fun `Given NewsRepository returns data, when getNewsArticles() called, then update live data`() {
        assertEquals(true, mNewsViewModel.isLoading.value)

        val liveData = MutableLiveData(TestUtils.mockPagedList(mockData.articles))
        whenever(mNewsRepository.getNewsArticles()).thenReturn(liveData)

        assertNotNull(mNewsViewModel.newsArticles)
        assertNotNull(mNewsViewModel.newsArticles.value)
        assertEquals(false, mNewsViewModel.newsArticles.value.isNullOrEmpty())

        assertEquals(true, mNewsViewModel.isLoading.value)
    }

    @Test
    fun `Given NewsRepository returns null, when getNewsArticles() called, then update live data`() {
        assertEquals(true, mNewsViewModel.isLoading.value)

        whenever(mNewsRepository.getNewsArticles()).thenReturn(null)

        assertNull(mNewsViewModel.newsArticles)

        assertEquals(true, mNewsViewModel.isLoading.value)
    }
}