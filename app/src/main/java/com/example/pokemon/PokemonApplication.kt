package com.example.pokemon

import android.app.Application
import com.example.dataModule
import com.example.domainModule
import com.example.pokemon.injection.*

import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext

public class PokemonApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            printLogger()
            // declare used Android context
            androidContext(this@PokemonApplication)
            // declare modules
            modules(
                listOf(
                    remoteModule,
                    dataSourceModule,
                    dataModule,
                    domainModule,
                    viewModelModule,
                    appModule
                )
            )
        }
    }

}