package com.example.pokemon.api

import com.example.entity.PokemonEntity
import com.example.entity.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon/")
    suspend fun getPokenonList(): PokemonResponse


    @GET("pokemon/")
    suspend fun getPokenonPagedList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonResponse
}