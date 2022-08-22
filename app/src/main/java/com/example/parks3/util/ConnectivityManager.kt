package com.example.parks3.util

import android.app.Application

import androidx.lifecycle.LifecycleOwner
import com.example.parks3.ConnectionLiveData


class ConnectivityManager

constructor(
        application: Application,
) {
    private val connectionLiveData = ConnectionLiveData(application)

    // observe this in ui
//    val isNetworkAvailable = mutableStateOf(false)

    fun registerConnectionObserver(lifecycleOwner: LifecycleOwner){
        connectionLiveData.observe(lifecycleOwner, { isConnected ->
//            isConnected?.let { isNetworkAvailable.value = it }
        })
    }

    fun unregisterConnectionObserver(lifecycleOwner: LifecycleOwner){
        connectionLiveData.removeObservers(lifecycleOwner)
    }
}