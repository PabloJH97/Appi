package com.pablojesushurtadohidalgo.appi.data.repositories

import com.pablojesushurtadohidalgo.appi.data.model.MediaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

object repositoryList {

    suspend fun getMedia(nombre: String): List<MediaItem> {
        var lista = mutableListOf<MediaItem>()
        withContext(Dispatchers.IO) {
            delay(2000)
            lista = (1..100).map {
                MediaItem(
                    id = it,
                    name = "$nombre",
                    sprites = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$it"
                )
            } as MutableList<MediaItem>
        }
        return lista
    }

    fun addMedia(mediaItem: MediaItem) {

    }
}