package com.example.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Versions(
        @Json(name = "generation-i") val generation1: Generation1? =null,
        @Json(name = "generation-ii") val generation2i: Generation2? =null,
        @Json(name = "generation-iii") val generation3: Generation3? =null,
        @Json(name = "generation-iv") val generation4: Generation4? =null,
        @Json(name = " generation-v") val generation5: Generation5? =null,
        @Json(name = "generation-vi") val generation6: Generation6? =null,
        @Json(name = "generation-vii") val generation7: Generation7? =null,
        @Json(name = "generation-viii") val generation8: Generation8? =null,
)

@JsonClass(generateAdapter = true)
data class Generation1(
        @Json(name = "red-blue") val redBlue: RedBlue? =null,
        val yellow: Yellow? =null,
)

@JsonClass(generateAdapter = true)
data class Generation2(
        val crystal: Crystal? =null,
        val gold: Gold? =null,
        val silver: Silver? =null,
)

@JsonClass(generateAdapter = true)
data class Generation3(
        val emerald: Emerald? =null,
        @Json(name = "firered-leafgreen") val fireredLeafgreen: FireredLeafgreen? =null,
        @Json(name = "ruby-sapphire") val rubySapphire: RubySapphire? =null,
)


@JsonClass(generateAdapter = true)
data class Generation4(
        @Json(name = "diamond-pearl") val diamondPearl: DiamondPearl? =null,
        @Json(name = "heartgold-soulsilver") val heartgoldSoulsilver: HeartgoldSoulsilver? =null,
        val platinum: Platinum? =null,
)

@JsonClass(generateAdapter = true)
data class Generation5(
        @Json(name = "black-white") val blackWhite: BlackWhite? =null
)

@JsonClass(generateAdapter = true)
data class Generation6(
        @Json(name = "omegaruby-alphasapphire") val omegarubyAlphasapphire: OmegarubyAlphasapphire? =null,
        @Json(name = "x-y") val xy: Xy? =null
)

@JsonClass(generateAdapter = true)
data class Generation7(
    val icons: Icons? =null,
    @Json(name = "ultra-sun-ultra-moon")  val ultraSunUltraMoon: UltraSunUltraMmoon? =null
)

@JsonClass(generateAdapter = true)
data class Generation8(
        val icons: Icons? =null
)


@JsonClass(generateAdapter = true)
data class RedBlue(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Yellow(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Crystal(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Gold(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Silver(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Emerald(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class FireredLeafgreen(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class RubySapphire(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

data class DiamondPearl(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)


@JsonClass(generateAdapter = true)
data class HeartgoldSoulsilver(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class Platinum(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class BlackWhite(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class OmegarubyAlphasapphire(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)
@JsonClass(generateAdapter = true)
data class Xy(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)

@JsonClass(generateAdapter = true)
data class UltraSunUltraMmoon(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)




@JsonClass(generateAdapter = true)
data class Icons(
        val animated: Animated?,
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,

        )

@JsonClass(generateAdapter = true)
data class Animated(
        @Json(name = "back_default") val backDefault: String? =null,
        @Json(name = "back_shiny") val backShiny: String? =null,
        @Json(name = "bak_female") val backFemale: String? =null,
        @Json(name = "back_shiny_female") val backShinyFemale: String? =null,
        @Json(name = "front_default") val frontDefault: String? =null,
        @Json(name = "front_shiny") val frontShiny: String? =null,
        @Json(name = "front_female") val frontFemale: String? =null,
        @Json(name = "front_shiny_female") val frontShinyFemale: String? =null,
)
