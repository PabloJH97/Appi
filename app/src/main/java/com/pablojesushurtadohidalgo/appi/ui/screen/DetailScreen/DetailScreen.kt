package com.pablojesushurtadohidalgo.appi.ui.screen.DetailScreen

import android.icu.text.CaseMap.Title
import androidx.compose.runtime.Composable
import com.pablojesushurtadohidalgo.appi.data.repositories.repositoryList
import com.pablojesushurtadohidalgo.appi.ui.screen.ListaScreen.Imagen
import com.pablojesushurtadohidalgo.appi.ui.screen.ListaScreen.Title

@Composable
fun DetailScreen(id: Int) {
    val mediaItem = repositoryList.getMedia().find { it.id == id }
    if (mediaItem != null) {
        Imagen(mediaItem)
        Title(mediaItem)
    }
}