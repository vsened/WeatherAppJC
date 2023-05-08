package com.vsened.weatherappjc.presentation

import com.vsened.weatherappjc.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
