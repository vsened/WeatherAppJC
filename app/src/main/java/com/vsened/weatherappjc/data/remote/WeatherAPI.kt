package com.vsened.weatherappjc.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_mls")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") lon: Double
    ): WeatherDto
}