package com.example.repository

import com.example.entity.PokemonEntity

//import com.example.entity.PokemonEntity

interface PokemonRepository {
    suspend fun getPokemonList(pageSize :Int ): List<PokemonEntity>
    suspend fun getPokemonDetail(name :String ): PokemonEntity

}