package com.example.pokemon.injection

import com.example.datasource.RemoteDataSource
import com.example.pokemon.datasource.RemoteDataSourceImpl
import org.koin.dsl.module


val dataSourceModule = module {

    factory<RemoteDataSource> {
        RemoteDataSourceImpl( )
    }

}

