package com.example.testactividaducare.remote

import com.example.testactividaducare.model.ListActividad
import retrofit2.Response
import retrofit2.http.GET

interface ApiActividad{
@GET("actividad/all")
    suspend fun getAll(): Response<ListActividad>
}