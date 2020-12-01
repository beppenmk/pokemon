package com.example.pokemon.injection

import com.example.datasource.DBDataSource
import com.example.datasource.RemoteDataSource
import com.example.pokemon.datasource.DBDataSourceImpl
import com.example.pokemon.datasource.PokemonDataSource
import com.example.pokemon.datasource.RemoteDataSourceImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val dataSourceModule = module {

    factory<RemoteDataSource> {
        RemoteDataSourceImpl(get() )
    }

    factory<DBDataSource> {
        DBDataSourceImpl( androidContext() )
    }



}

