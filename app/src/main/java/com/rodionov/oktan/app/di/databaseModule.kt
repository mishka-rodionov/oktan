package com.rodionov.oktan.app.di

import android.content.Context
import com.rodionov.oktan.data.database.FuelStationDatabase
import org.koin.dsl.module

val databaseModule = module {
    single { provideDatabase(get()) }
    single { getGasolineStationDao(get()) }
}

fun provideDatabase(context: Context) = FuelStationDatabase.buildDatabase(context)
fun getGasolineStationDao(fuelStationDatabase: FuelStationDatabase) = fuelStationDatabase.gasolineStationDao()