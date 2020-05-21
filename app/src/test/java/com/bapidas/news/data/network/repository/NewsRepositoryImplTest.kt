package com.bapidas.news.data.network.repository

import com.bapidas.news.BuildConfig
import com.bapidas.news.RxImmediateSchedulerRule
import com.bapidas.news.TestUtils
import com.bapidas.news.data.db.dao.NewsArticlesDao
import com.bapidas.news.data.network.remote.api.NewsApi
import com.bapidas.news.data.network.remote.response.NewsListResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.nhaarman.mockito_kotlin.whenever
import io.reactivex.Single
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class NewsRepositoryImplTest {
    @Rule
    @JvmField
    var testSchedulerRule = RxImmediateSchedulerRule()

    @Mock
    lateinit var mNewsApi: NewsApi

    @Mock
    lateinit var mNewsArticlesDao: NewsArticlesDao

    lateinit var mNewsRepositoryImpl: NewsRepositoryImpl
    lateinit var mockData: NewsListResponse
    lateinit var mGson: Gson

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mNewsRepositoryImpl = NewsRepositoryImpl(mNewsApi, mNewsArticlesDao)
        mGson = GsonBuilder().create()
        val data = TestUtils.readFromFile("/mock_response.json")
        mockData = mGson.fromJson(data, NewsListResponse::class.java)
    }

    @Test
    fun `Given NewsApi getNewsArticles() returns data, when loadNewsArticles() called, then update variable`() {
        assertEquals(0, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(0, mNewsRepositoryImpl.totalNewsArticle)

        whenever(
            mNewsApi.getNewsArticles(
                NewsRepositoryImpl.CATEGORY,
                NewsRepositoryImpl.PAGE_SIZE,
                NewsRepositoryImpl.INITIAL_PAGE,
                BuildConfig.API_KEY
            )
        )
            .thenReturn(Single.just(mockData))

        mNewsRepositoryImpl.loadNewsArticles(NewsRepositoryImpl.INITIAL_PAGE)

        assertEquals(NewsRepositoryImpl.PAGE_SIZE, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(mockData.totalResults, mNewsRepositoryImpl.totalNewsArticle)
    }

    @Test
    fun `Given NewsApi getNewsArticles() returns latest data, when loadNewsArticles() called with latestLoad true, then update variable`() {
        assertEquals(0, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(0, mNewsRepositoryImpl.totalNewsArticle)

        whenever(
            mNewsApi.getNewsArticles(
                NewsRepositoryImpl.CATEGORY,
                NewsRepositoryImpl.PAGE_SIZE,
                NewsRepositoryImpl.INITIAL_PAGE,
                BuildConfig.API_KEY
            )
        ).thenReturn(Single.just(mockData))

        whenever(mNewsArticlesDao.getNewsArticlesCount()).thenReturn(40)

        mNewsRepositoryImpl.loadNewsArticles(NewsRepositoryImpl.INITIAL_PAGE, true)

        assertEquals(40, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(mockData.totalResults, mNewsRepositoryImpl.totalNewsArticle)
    }

    @Test
    fun `Call NewsApi getNewsArticles(), when Item Finished in list, then update variable`() {
        assertEquals(0, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(0, mNewsRepositoryImpl.totalNewsArticle)

        mNewsRepositoryImpl.loadedNewsArticle = 20
        mNewsRepositoryImpl.totalNewsArticle = mockData.totalResults

        whenever(
            mNewsApi.getNewsArticles(
                NewsRepositoryImpl.CATEGORY,
                NewsRepositoryImpl.PAGE_SIZE,
                2,
                BuildConfig.API_KEY
            )
        ).thenReturn(Single.just(mockData))

        mNewsRepositoryImpl.loadNewsArticles()

        assertEquals(40, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(mockData.totalResults, mNewsRepositoryImpl.totalNewsArticle)
    }

    @Test
    fun `Call NewsApi getNewsArticles(), when it throws Error, then update variable`() {
        assertEquals(0, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(0, mNewsRepositoryImpl.totalNewsArticle)

        whenever(
            mNewsApi.getNewsArticles(
                NewsRepositoryImpl.CATEGORY,
                NewsRepositoryImpl.PAGE_SIZE,
                NewsRepositoryImpl.INITIAL_PAGE,
                BuildConfig.API_KEY
            )
        ).thenReturn(Single.error(Throwable()))

        mNewsRepositoryImpl.loadNewsArticles(NewsRepositoryImpl.INITIAL_PAGE)

        assertEquals(0, mNewsRepositoryImpl.loadedNewsArticle)
        assertEquals(0, mNewsRepositoryImpl.totalNewsArticle)
    }
}