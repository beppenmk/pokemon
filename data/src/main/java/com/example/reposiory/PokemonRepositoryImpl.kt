package com.example.reposiory


import com.example.datasource.DBDataSource
import com.example.datasource.RemoteDataSource
import com.example.entity.PokemonEntity
import com.example.repository.PokemonRepository

class PokemonRepositoryImpl(
    private var remoteDataSource: RemoteDataSource,
    private var dpDataSource: DBDataSource
) : PokemonRepository {

    override suspend fun getPokemonList(pageSize: Int): List<PokemonEntity> {
        return remoteDataSource.getPokemonList()
        //return  PokemonEntity(name ="TEST ${DateTimeFormatter.ISO_INSTANT.format(Instant.now())}")
    }

    override suspend fun getPokemonDetail(name: String): PokemonEntity {

        val pokemon = remoteDataSource.getPokemonDetail(name)
        dpDataSource.insertPokemon(pokemon)
        return pokemon
    }


}