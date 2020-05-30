package com.bapidas.news.common.network

import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

inline fun <reified T> Single<T>.request(
    noinline onSubscribe: () -> Unit,
    noinline onTerminate: () -> Unit,
    crossinline onSuccess: (T) -> Unit,
    noinline onError: (Throwable) -> Unit
): Disposable = applyIoScheduler()
    .doOnSubscribe {
        onSubscribe()
    }
    .doOnTerminate {
        onTerminate()
    }
    .subscribe({ response ->
        onSuccess(response)
    }, { error ->
        onError(error)
    })

fun Disposable.disposeWith(compositeDisposable: CompositeDisposable?) =
    compositeDisposable?.add(this)

fun <T> Single<T>.applyIoScheduler() =
    applyScheduler(Schedulers.io())

private fun <T> Single<T>.applyScheduler(scheduler: Scheduler) =
    subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread())