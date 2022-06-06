package com.example.velibmapapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("get-all-stations")
    suspend fun getData(): List<StationItem>
}

