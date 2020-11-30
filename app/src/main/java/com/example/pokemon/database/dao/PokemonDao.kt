package com.example.pokemon.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.entity.PokemonEntity

@Dao
interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    fun getAll(): List<PokemonEntity>

    @Query("SELECT * FROM pokemon WHERE id == :id")
    fun loadAllByIds(id: IntArray): List<PokemonEntity>

    @Insert
    fun insertAll(vararg pokemon: PokemonEntity)

    @Delete
    fun delete(pokemon: PokemonEntity)
}