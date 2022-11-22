package com.codinginflow.weatherapp.domain.util

class Constants {

    companion object {

        const val BASE_URL = "https://api.open-meteo.com/"

        const val API_QUERY = "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl"

    }

}