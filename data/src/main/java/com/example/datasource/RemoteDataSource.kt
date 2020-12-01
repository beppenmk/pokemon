package com.example.datasource

import com.example.entity.PokemonEntity



interface RemoteDataSource {
    suspend fun getPokemonList() :  List<PokemonEntity>
    suspend fun getPokemonDetail(name :String) :   PokemonEntity
}

