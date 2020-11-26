package com.example.datasource

import com.example.entity.PokemonEntity



interface RemoteDataSource {
    suspend fun getPokemonList() :  List<PokemonEntity>
}

