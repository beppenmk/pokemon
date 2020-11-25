package com.example.pokemon.datasource

import com.example.datasource.RemoteDataSource
import com.example.entity.PokemonEntity
import com.example.pokemon.api.PokemonApi

class RemoteDataSourceImpl(
    private val pokemonApi: PokemonApi
) : RemoteDataSource {
    override suspend fun getPokemonList(): List<PokemonEntity> {
        val _pokemonResponse = pokemonApi.getPokenonList()
        print("xx")
        return _pokemonResponse.results
    }

}