package com.example.pokemon

import android.app.Application
import com.example.dataModule
import com.example.domainModule
import com.example.pokemon.injection.appModule
import com.example.pokemon.injection.remoteDataSourceModule
import com.example.pokemon.injection.viewModelModule
import com.example.useCaseModule
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
                    remoteDataSourceModule,
                    dataModule,
                    domainModule,
                    viewModelModule,
                    useCaseModule,
                    appModule
                )
            )
        }
    }

}