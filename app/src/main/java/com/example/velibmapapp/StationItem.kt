package com.example.velibmapapp

data class StationItem(
    val bikes_available: Int,
    val capacity: Int,
    val ebikes_available: Int,
    val last_reported: Int,
    val lat: Double,
    val lon: Double,
    val name: String,
    val num_docks_available: Int,
    val stationCode: String,
    val station_id: Long
)