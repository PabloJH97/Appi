package com.pablojesushurtadohidalgo.appi.data.repositories.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonDetailsTypeItemModel(
    @SerializedName("slot") val slot: Int,
    @SerializedName("type") val type: PokemonDetailsTypeModel
): Parcelable
