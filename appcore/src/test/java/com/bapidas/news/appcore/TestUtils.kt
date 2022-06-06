package com.bapidas.news.appcore

import androidx.paging.PagedList
import org.mockito.ArgumentMatchers
import org.mockito.Mockito
import java.io.InputStream

object TestUtils {
    fun <T> mockPagedList(list: List<T>): PagedList<T> {
        val pagedList = Mockito.mock(PagedList::class.java) as PagedList<T>
        Mockito.`when`(pagedList[ArgumentMatchers.anyInt()]).then { invocation ->
            val index = invocation.arguments.first() as Int
            list[index]
        }
        Mockito.`when`(pagedList.size).thenReturn(list.size)
        return pagedList
    }

    fun readFromFile(filename: String): String? {
        val `is`: InputStream? = javaClass.getResourceAsStream(filename)
        val stringBuilder = java.lang.StringBuilder()
        var i: Int
        val b = ByteArray(4096)
        while (`is`!!.read(b).also { i = it } != -1) {
            stringBuilder.append(String(b, 0, i))
        }
        return stringBuilder.toString()
    }
}