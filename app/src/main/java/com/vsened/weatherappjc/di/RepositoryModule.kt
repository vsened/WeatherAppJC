package com.vsened.weatherappjc.di

import com.vsened.weatherappjc.data.location.DefaultLocationTracker
import com.vsened.weatherappjc.data.repository.WeatherRepositoryImpl
import com.vsened.weatherappjc.domain.location.LocationTracker
import com.vsened.weatherappjc.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}