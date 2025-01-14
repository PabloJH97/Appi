package com.pablojesushurtadohidalgo.appi.data.repositories.model

import com.pablojesushurtadohidalgo.appi.data.model.MediaItem

data class PokeRepo2(
    val base_experience: Int,
    val height: Int,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val name: String,
    val order: Int,
    val past_abilities: List<Any?>,
    val past_types: List<Any?>,
    val sprites: Sprites,
    val weight: Int
)

fun PokeRepo2.toMediaItem()= MediaItem(
    id,
    name,
    sprites.front_default
)