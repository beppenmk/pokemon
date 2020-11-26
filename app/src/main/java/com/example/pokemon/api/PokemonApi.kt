package com.example.pokemon.api

import com.example.entity.PokemonEntity
import com.example.entity.PokemonResponse
import retrofit2.http.GET

interface PokemonApi {

    @GET("pokemon/")
    suspend fun getPokenonList(): PokemonResponse

}