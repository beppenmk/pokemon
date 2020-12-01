package com.example.entity

import androidx.room.*
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
open class PokemonEntity(
        val id: Int?,
        val name: String? = null,
        @Json(name = "base_experience") val baseExperience: Int? = null,
        val url: String? = null,
        @Json(name = "is_default") val isDefault: Boolean? = null,
        val gameIndices: List<GameIndices> = emptyList(),
        val height: Int? = null,
        val weight: Int? = null,
        val order: Int? = null,
        @Json(name = "location_area_encounters") val locationAreaEncounters: String? = null,
        val moves: List<Move> = emptyList(),
        val species: Species? = null,
        val sprites: Sprites? = null,
        val stats: List<Stats> = emptyList(),
        val types: List<Types> = emptyList(),


) {

}

@JsonClass(generateAdapter = true)
data class GameIndices(
        @Json(name = "game_index") val gameIndex: Int? = null,
        @Json(name = "version") val version: Version? = null,
)

@JsonClass(generateAdapter = true)
data class Version(
        val name: String? = null,
        val url: String? = null,
)

@JsonClass(generateAdapter = true)
data class Move(
        val name: String? = null,
        val url: String? = null
)

@JsonClass(generateAdapter = true)
data class Species(
        val name: String? = null,
        val url: String? = null,
)

@JsonClass(generateAdapter = true)
data class Sprites(
        @Json(name = "back_default") val backDefault: String? = null,
        @Json(name = "back_female") val backFemale: String? = null,
        @Json(name = "back_shiny") val backShiny: String? = null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? = null,
        @Json(name = "front_default") val frontDefault: String? = null,
        @Json(name = "front_female") val frontFemale: String? = null,
        @Json(name = "front_shiny") val frontShiny: String? = null,
        @Json(name = "front_shiny_female") val fronShinyFemale: String? = null,
        val other: Other? = null,
        val versions: Versions? = null
)

@JsonClass(generateAdapter = true)
data class Other(
        @Json(name = "dream_world") val dreamWorld: DreamWorld? = null,
        @Json(name = "official-artwork") val officialArtwork: OfficialArtwork? = null
)

@JsonClass(generateAdapter = true)
data class OfficialArtwork(
        @Json(name = "front_default") val frontDefault: String? = null
)


@JsonClass(generateAdapter = true)
data class DreamWorld(
        @Json(name = "front_default") val front_default: String? = null,
        @Json(name = "front_female") val front_female: String? = null
)

@JsonClass(generateAdapter = true)
data class Stats(
        @Json(name = "base_stat") val baseStat: Int,
        val effort: Int,
        val stat: Stat
)

@JsonClass(generateAdapter = true)
data class Stat(
        val name: String? = null,
        val url: String? = null
)

@JsonClass(generateAdapter = true)
data class Types(
        val slot: Int? = null,
        val type: Type? = null
)

@JsonClass(generateAdapter = true)
data class Type(
        val name: String? = null,
        val url: String? = null
)