package com.pablojesushurtadohidalgo.appi.ui.screen.ListaScreen

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pablojesushurtadohidalgo.appi.data.model.MediaItem
import com.pablojesushurtadohidalgo.appi.data.repositories.PokemonListRepository
import com.pablojesushurtadohidalgo.appi.data.repositories.PokemonListRepositoryInterface
import com.pablojesushurtadohidalgo.appi.data.repositories.RemoteConnection
import com.pablojesushurtadohidalgo.appi.data.repositories.model.PokemonListModel
import com.pablojesushurtadohidalgo.appi.data.repositories.model.toMediaItem
import com.pablojesushurtadohidalgo.appi.data.repositories.repositoryList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ListaViewModel(
    private val repositorio: PokemonListRepositoryInterface= PokemonListRepository()
): ViewModel() {
    private val _pokemonList = MutableStateFlow<PokemonListModel?>(null)
    private val _errorMessage = MutableStateFlow<String?>(null)
    private val _isLoading = MutableStateFlow<Boolean>(true)
    private val _progressBar: MutableLiveData<Boolean> = MutableLiveData(false)
    val pokemonList: StateFlow<PokemonListModel?> get() = _pokemonList.asStateFlow()
    val errorMessage: StateFlow<String?> get() = _errorMessage.asStateFlow()
    val isLoading: StateFlow<Boolean> get() = _isLoading.asStateFlow()
    val progressBar: LiveData<Boolean> = _progressBar

    init {
        _progressBar.value = true
        viewModelScope.launch() {
            val pokemons = repositorio.getPokemonList(0, 150)
            _pokemonList.value = pokemons.results.map {
                it.toMediaItem()
            }
            _progressBar.value = false
        }
    }
}