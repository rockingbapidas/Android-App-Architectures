package com.bapidas.news.ui.base.adapter

sealed class NetworkState
data class NetworkError(val message: String?) : NetworkState()
object Loading : NetworkState()
object Success : NetworkState()