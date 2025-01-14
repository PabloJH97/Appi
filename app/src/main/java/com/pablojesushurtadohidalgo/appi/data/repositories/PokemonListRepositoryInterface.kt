package com.pablojesushurtadohidalgo.appi.data.repositories

import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokemonListModel
import com.pablojesushurtadohidalgo.appi.data.repositories.model.Response

interface PokemonListRepositoryInterface {
    suspend fun getPokemonList(offset: Int, limit: Int): Response<PokemonListModel>
}