package com.codinginflow.weatherapp.domain.repository

import com.codinginflow.weatherapp.domain.util.Resource
import com.codinginflow.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}