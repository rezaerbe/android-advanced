package com.erbe.todoapp.util

import androidx.test.espresso.idling.CountingIdlingResource

/**
 * Contains a static reference to [IdlingResource]
 */
object EspressoIdlingResource {

    private const val RESOURCE = "GLOBAL"

    @JvmField
    val countingIdlingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        countingIdlingResource.increment()
    }

    fun decrement() {
        if (!countingIdlingResource.isIdleNow) {
            countingIdlingResource.decrement()
        }
    }
}

inline fun <T> wrapEspressoIdlingResource(function: () -> T): T {
    // Espresso does not work well with coroutines yet. See
    // https://github.com/Kotlin/kotlinx.coroutines/issues/982
    EspressoIdlingResource.increment() // Set app is busy.
    return try {
        function()
    } finally {
        EspressoIdlingResource.decrement() // Set app is idle.
    }
}