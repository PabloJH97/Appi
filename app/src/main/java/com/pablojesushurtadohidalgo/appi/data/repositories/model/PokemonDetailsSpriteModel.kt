package com.pablojesushurtadohidalgo.appi.data.repositories.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonDetailsSpritesModel(
    @SerializedName("front_default") val imageURL: String
): Parcelable
