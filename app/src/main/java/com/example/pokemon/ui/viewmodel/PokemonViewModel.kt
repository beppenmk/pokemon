package com.example.pokemon.ui.viewmodel


import com.example.entity.PokemonEntity
import com.example.pokemon.ui.state.PokemonState
import com.example.usecase.GetPokemonListUseCase
import io.uniflow.androidx.flow.AndroidDataFlow
import io.uniflow.core.flow.data.UIState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow


@OptIn(ExperimentalCoroutinesApi::class)
class PokemonViewModel(
    private val getPokemonListUseCase: GetPokemonListUseCase,

    ) : AndroidDataFlow(defaultState = UIState.Empty) {



    fun getPokemonList() = action {


            val list = getPokemonListUseCase.invoke()
            setState { PokemonState(name =  list.first()  .name ?: "") }


    }



}