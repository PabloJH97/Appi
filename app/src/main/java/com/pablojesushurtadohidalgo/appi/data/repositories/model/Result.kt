package com.pablojesushurtadohidalgo.appi.data.repositories.model

import com.pablojesushurtadohidalgo.appi.data.model.MediaItem

data class Result(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)

fun Result.toMediaItem() = MediaItem(
    id,
    title,
    "https://image.tmdb.org/t/p/w185/$poster_path",
    original_language,
    original_title,
    overview,
    vote_average
)