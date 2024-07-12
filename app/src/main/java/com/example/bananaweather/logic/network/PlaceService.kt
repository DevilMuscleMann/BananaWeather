package com.example.bananaweather.logic.network

import com.example.bananaweather.BananaWeatherApplication
import com.example.bananaweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${BananaWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query:String) : Call<PlaceResponse>
}