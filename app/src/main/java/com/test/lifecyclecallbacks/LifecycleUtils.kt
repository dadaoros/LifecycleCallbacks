package com.test.lifecyclecallbacks

import android.util.Log

/**
 * @author david.ortegon on 9/04/2019.
 */

private const val LIFECYCLE_TAG = "LIFECYCLE_TEST"
private const val EVENT_TAG = "EVENT_TEST"

fun Any.logLifecycle(s: String) {
    log(LIFECYCLE_TAG, s, this::class.simpleName.orEmpty())
}

fun Any.logEvent(s: String) {
    log(EVENT_TAG, s, this::javaClass.name)
}

private fun log(tag: String, text: String, className: String){
    Log.d(tag, StringBuilder(text).append(" - ").append(className).toString())
}