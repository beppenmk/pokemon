package com.example.pokemon.database

import android.content.Context
 import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.entity.PokemonEntity
import com.example.pokemon.database.dao.PokemonDao



@Database(entities = [PokemonEntity::class], version = 1)
abstract class PokemonDatabase : RoomDatabase() {

    abstract fun pokemonDao(): PokemonDao


    companion object {
        private var INSTANCE: PokemonDatabase? = null
        private const val DB_NAME = "pokemon.db"

        fun getDatabase(context: Context): PokemonDatabase {
            if (INSTANCE == null) {
                synchronized(PokemonDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.applicationContext, PokemonDatabase::class.java, DB_NAME)
                             .addCallback(object : Callback() {
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                }
                            }).build()
                    }
                }
            }

            return INSTANCE!!
        }
    }
}