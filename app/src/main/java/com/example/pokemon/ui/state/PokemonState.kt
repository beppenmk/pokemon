package com.example.pokemon.ui.state

import com.example.entity.PokemonEntity
import io.uniflow.core.flow.data.UIState


data class PokemonState(
    val value: PokemonEntity
) : UIState()