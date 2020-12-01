package com.example.usecase

import com.example.entity.PokemonEntity
import com.example.repository.PokemonRepository


class GetPokemonDetailUseCase(private var repository: PokemonRepository) {
    suspend fun invoke(name: String):  PokemonEntity {
        return repository.getPokemonDetail(name)
    }
}