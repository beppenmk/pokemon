package com.example.pokemon.injection

import com.example.pokemon.ui.viewmodel.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel


import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        PokemonViewModel(
            pokemonApi = get(),
            getPokemonListUseCase = get(),
            getPokemonDetailUseCase = get()
        )
    }


}

