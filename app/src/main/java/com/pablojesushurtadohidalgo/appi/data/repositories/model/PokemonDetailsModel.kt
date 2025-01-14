package com.pablojesushurtadohidalgo.appi.data.repositories.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonDetailsModel(
    @SerializedName("name") val name: String,
    @SerializedName("weight") val weight: Int,
    @SerializedName("height") val height: Int,
    @SerializedName("types") val types: List<PokemonDetailsTypeItemModel>,
    @SerializedName("sprites") val sprite: PokemonDetailsSpritesModel
): Parcelable
