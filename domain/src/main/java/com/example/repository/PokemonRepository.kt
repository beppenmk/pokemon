package com.example.repository

import com.example.entity.PokemonEntity

//import com.example.entity.PokemonEntity

interface PokemonRepository {
    suspend fun getPokemonList() : List<PokemonEntity>
}