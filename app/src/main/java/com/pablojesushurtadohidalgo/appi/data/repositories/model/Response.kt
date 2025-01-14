package com.pablojesushurtadohidalgo.appi.data.repositories.model

import kotlin.Result

data class Response<T>(
    val page: Int,
    val results: PokemonListModel,
    val total_pages: Int,
    val isSuccessful: Boolean
)