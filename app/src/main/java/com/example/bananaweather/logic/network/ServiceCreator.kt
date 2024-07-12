package com.example.bananaweather.logic.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private  const val BASE_URL = "https://api.caiyunapp.com/"
    val client = OkHttpClient.Builder()
        .addInterceptor(LoggingInterceptor()) // 添加自定义的拦截器
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)
    inline fun <reified T> create(): T = create((T::class.java))
}