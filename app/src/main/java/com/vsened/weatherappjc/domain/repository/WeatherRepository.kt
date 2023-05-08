package com.vsened.weatherappjc.domain.repository

import com.vsened.weatherappjc.domain.util.Resource
import com.vsened.weatherappjc.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}