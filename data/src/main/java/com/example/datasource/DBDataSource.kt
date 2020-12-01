package com.example.datasource

import com.example.entity.PokemonEntity



interface DBDataSource {

    suspend fun insertPokemon(pokemon :PokemonEntity)
}

