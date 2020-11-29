package com.example.pokemon.datasource


import androidx.paging.PagingSource
import com.example.pokemon.datasource.PokemonDataSource
import com.example.entity.PokemonEntity
import com.example.pokemon.api.PokemonApi

class PokemonDataSource(
    private val pokemonApi: PokemonApi
) :  PagingSource<Int, PokemonEntity>() {





    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonEntity> {
        val nextPage = params.key ?: 1
        val response = pokemonApi.getPokenonPagedList(params.loadSize, (params.loadSize * (nextPage - 1)))
        try {
            return LoadResult.Page(
                data = response.results,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = nextPage + 1
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }

    }


}