package com.example.usecase

import com.example.entity.PokemonEntity
import com.example.repository.PokemonRepository


class GetPokemonListUseCase(private var repository: PokemonRepository) {
    suspend fun invoke(pageSize: Int): List<PokemonEntity> {
        return repository.getPokemonList(pageSize)
    }
}