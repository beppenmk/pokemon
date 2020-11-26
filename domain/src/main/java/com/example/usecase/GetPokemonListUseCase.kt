package com.example.usecase

//import com.example.entity.PokemonEntity
import com.example.entity.PokemonEntity
import com.example.repository.PokemonRepository
import kotlinx.coroutines.flow.Flow
import sun.rmi.runtime.Log


class GetPokemonListUseCase(private var repository: PokemonRepository) {

    suspend fun invoke():  List<PokemonEntity> {

        return repository.getPokemonList()
    }
}