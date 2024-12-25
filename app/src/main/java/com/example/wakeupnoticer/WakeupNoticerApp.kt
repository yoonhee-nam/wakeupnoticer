package com.example.wakeupnoticer

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WakeupNoticerApp : Application() {
    @SuppressLint("StaticFieldLeak")
    companion object{
        lateinit var context: Context
    }

    override fun onCreate(){
        super.onCreate()
        context = this.applicationContext
    }
}