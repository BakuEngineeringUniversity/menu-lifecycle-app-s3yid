package com.example.myapplication
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLocationListener(private val lifecycle: LifecycleOwner) : DefaultLifecycleObserver {

    private var enabled = false

    override fun onStart(owner: LifecycleOwner) {
        if (enabled) {
            // connect to location service
        }
    }

    fun enable() {
        enabled = true
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            // connect to location service if not connected
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        // disconnect from location service
        }
}

