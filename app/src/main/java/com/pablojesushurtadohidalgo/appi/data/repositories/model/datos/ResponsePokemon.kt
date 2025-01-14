package com.pablojesushurtadohidalgo.appi.data.repositories.model.datos

data class ResponsePokemon(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)