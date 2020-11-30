package com.example.pokemon.datasource

import android.content.Context
import com.example.datasource.DBDataSource
import com.example.entity.PokemonEntity
import com.example.pokemon.database.PokemonDatabase
import com.example.pokemon.database.dao.PokemonDao

class DBDataSourceImpl(
    context: Context
) : DBDataSource {

    val context: Context = context


    override suspend fun insertPokemon(pokemon: PokemonEntity) {
        val pokemonDao: PokemonDao = PokemonDatabase.getDatabase(context).pokemonDao()
        pokemonDao.insertAll(pokemon)
    }


}