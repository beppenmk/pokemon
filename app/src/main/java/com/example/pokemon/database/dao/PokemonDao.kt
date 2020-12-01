package com.example.pokemon.database.dao

import androidx.room.*
import com.example.entity.PokemonDbEntity
import com.example.entity.PokemonEntity

@Dao
interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    fun getAll(): List<PokemonDbEntity>

    @Query("SELECT * FROM pokemon WHERE id == :id")
    fun loadAllByIds(id: IntArray): List<PokemonDbEntity>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg pokemon: PokemonDbEntity)

    @Delete
    fun delete(pokemon: PokemonDbEntity)
}