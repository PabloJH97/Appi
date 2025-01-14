package com.pablojesushurtadohidalgo.appi.data.repositories.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonListItem(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
): Parcelable
