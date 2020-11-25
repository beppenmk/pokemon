package com.example.entity

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
open class PokemonResponse(
    val count: Int,
    var next: String? = null,
    var previous: String? = null,
    var results: List<PokemonEntity>

)