package com.vsened.weatherappjc.data.repository

import com.vsened.weatherappjc.data.mappers.toWeatherInfo
import com.vsened.weatherappjc.data.remote.WeatherAPI
import com.vsened.weatherappjc.domain.repository.WeatherRepository
import com.vsened.weatherappjc.domain.util.Resource
import com.vsened.weatherappjc.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lon =  long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}