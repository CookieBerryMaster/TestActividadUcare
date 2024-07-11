package com.example.testactividaducare.model

import com.example.testactividaducare.entity.Estudiante

data class ActividadItem(
    val id: Int,
    val completada: Boolean,
    val estudiante: Estudiante,
    val etiqueta: String,
    val fechaCreacion: String,
    val fechaLimite: String,
    val nombre: String
)