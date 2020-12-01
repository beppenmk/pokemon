package com.example.entity

import androidx.room.*
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//TODO ADD FOREIGNTABLE
@Entity(
    tableName = "pokemon",
    /*    foreignKeys = [ForeignKey(
        entity = Stats::class,
        parentColumns = [" "],
        childColumns = [],
        onDelete = ForeignKey.CASCADE
    )],*/
    indices = [Index("id")]
)

@JsonClass(generateAdapter = true)
open class PokemonDbEntity(
    @PrimaryKey val id: Int?,
    @ColumnInfo(name = "name") val name: String? = null,
    @Json(name = "base_experience") val baseExperience: Int? = null,
    val url: String? = null,
    @Json(name = "is_default") val isDefault: Boolean? = null,

    @ColumnInfo(name = "height") val height: Int? = null,
    @ColumnInfo(name = "weight") val weight: Int? = null,
    val order: Int? = null,

    ) {

}
