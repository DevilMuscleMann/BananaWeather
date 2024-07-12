package com.example.bananaweather.logic.network

import com.example.bananaweather.BananaWeatherApplication
import com.example.bananaweather.logic.model.DailyResponse
import com.example.bananaweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService{
    @GET("v2.5/${BananaWeatherApplication.TOKEN}/{lng},{lat}/realtime.josn")
    fun getRealtimeWeather(@Path("lng") lng:String,@Path("lat") lat:String) :
            Call<RealtimeResponse>

    @GET("v2.5/${BananaWeatherApplication.TOKEN}/{lng},{lat}/daily.josn")
    fun getDailyWeather(@Path("lng") lng:String,@Path("lat") lat:String) :
            Call<DailyResponse>
}