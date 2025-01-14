package com.pablojesushurtadohidalgo.appi.data.repositories

import android.util.Log
import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokemonListModel
import com.pablojesushurtadohidalgo.appi.data.repositories.model.Response

class PokemonListRepository(
    private val remoteService: RemoteService = getRetrofitClient()
): PokemonListRepositoryInterface {
    override suspend fun getPokemonList(offset: Int, limit: Int): Response<PokemonListModel> {
        Log.d("Repository getPokemonList", "$offset, $limit")
        return remoteService.getPokemonList(offset = offset, limit = limit)
    }
}