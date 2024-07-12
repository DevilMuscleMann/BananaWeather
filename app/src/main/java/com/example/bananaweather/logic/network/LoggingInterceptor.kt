package com.example.bananaweather.logic.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class LoggingInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val url = request.url()
        println("Request URL: $url")

        // 继续处理请求链
        val response: Response = chain.proceed(request)

        return response
    }
}