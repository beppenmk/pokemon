package com.example.pokemon.ui.viewmodel


import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.example.pokemon.datasource.PokemonDataSource

import com.example.entity.PokemonEntity
import com.example.pokemon.api.PokemonApi
import com.example.pokemon.ui.state.PokemonState
import com.example.usecase.GetPokemonDetailUseCase
import com.example.usecase.GetPokemonListUseCase
import io.uniflow.androidx.flow.AndroidDataFlow
import io.uniflow.core.flow.data.UIState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import org.koin.experimental.property.inject


@OptIn(ExperimentalCoroutinesApi::class)
class PokemonViewModel(
    private val getPokemonListUseCase: GetPokemonListUseCase,
    private val getPokemonDetailUseCase: GetPokemonDetailUseCase,
    private val pokemonApi: PokemonApi
) : AndroidDataFlow(defaultState = UIState.Empty) {

    val VIEW_IN_PAGE: Int = 10


    fun getPokemonList() = action {
        val list = getPokemonListUseCase.invoke(pageSize = VIEW_IN_PAGE)
        setState { PokemonState(name = list.first().name ?: "") }
    }

    fun getPokemonDetail(name:String) = action {
        val pokemon = getPokemonDetailUseCase.invoke( name = name)
        setState { PokemonState(name = pokemon.name ?: "") }
    }



    val list: Flow<PagingData<PokemonEntity>> = Pager(
        PagingConfig(pageSize = VIEW_IN_PAGE)
    ) {
        PokemonDataSource(pokemonApi)
        // getPokemonPagedListUseCase.invoke( )
    }.flow
        .cachedIn(viewModelScope)


}