package com.example.bananaweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.example.bananaweather.BananaWeatherApplication
import com.example.bananaweather.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    fun savePlace(place: Place){
        println("-----------------------------Dao.saveplace")
        println(Gson().toJson(place))
        sharedPreferences().edit{
            putString("Place", Gson().toJson(place))
        }

    }

    fun getSavedPlace(): Place{
        val placeJson = sharedPreferences().getString("Place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("Place")

    private fun sharedPreferences() = BananaWeatherApplication.context.getSharedPreferences("Banana_weather",Context.MODE_PRIVATE)

}