package com.example.bananaweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class BananaWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "KQs859138ZDxwdZx"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}