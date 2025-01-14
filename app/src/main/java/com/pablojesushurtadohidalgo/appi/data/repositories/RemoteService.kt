package com.pablojesushurtadohidalgo.appi.data.repositories

import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokeRepo2
import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokemonDetailsModel
import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokemonListModel
import com.pablojesushurtadohidalgo.appi.data.repositories.model.Response
import com.pablojesushurtadohidalgo.appi.data.repositories.model.datos.ResponseApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RemoteService {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): List<ResponseApi>

    @GET("pokemon/{name}")
    suspend fun getPokemonDetails(
        @Path("name") name: String
    ): Response<PokemonDetailsModel>

    fun getRetrofitClient(): RemoteService {
        // Create or client
        val client = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/") // Specify your base URL
            .addConverterFactory(GsonConverterFactory.create()) // Specify JSon convertion method
            .client(OkHttpClient())// Add converter factory for Gson
            .build()
        return client.create(RemoteService::class.java)
    }

}