package com.example

import com.example.reposiory.PokemonRepositoryImpl
import com.example.repository.PokemonRepository
import org.koin.dsl.module

val dataModule = module {

    factory<PokemonRepository> {
        PokemonRepositoryImpl(get())
    }



}