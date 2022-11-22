package com.codinginflow.weatherapp.data.remote

import com.codinginflow.weatherapp.domain.util.Constants.Companion.API_QUERY
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(API_QUERY)
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}