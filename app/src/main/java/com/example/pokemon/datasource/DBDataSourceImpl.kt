package com.example.pokemon.datasource

import android.content.Context
import androidx.room.ColumnInfo
import com.example.datasource.DBDataSource
import com.example.entity.PokemonDbEntity
import com.example.entity.PokemonEntity
import com.example.pokemon.database.PokemonDatabase
import com.example.pokemon.database.dao.PokemonDao
import com.squareup.moshi.Json

class DBDataSourceImpl(
    context: Context
) : DBDataSource {

    val context: Context = context


    override suspend fun insertPokemon(pokemon: PokemonEntity) {
        val pokemonDao: PokemonDao = PokemonDatabase.getDatabase(context).pokemonDao()
        pokemonDao.insertAll(PokemonDbEntity(
            name= pokemon.name,
            baseExperience = pokemon.baseExperience,
            height = pokemon.height,
            isDefault = pokemon.isDefault,
            order = pokemon.order,
            url = pokemon.url,
            weight = pokemon.weight,
            id = pokemon.id

        ))
    }
}