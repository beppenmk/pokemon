package com.example.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
open class PokemonEntity(
    var name: String? = null,
    var url: String? = null
) {

}