package com.example


import com.example.usecase.GetPokemonDetailUseCase
import com.example.usecase.GetPokemonListUseCase
import org.koin.dsl.module

val domainModule = module {

    //USECASE
    factory { GetPokemonListUseCase(get()) }
    factory { GetPokemonDetailUseCase(get()) }
}


