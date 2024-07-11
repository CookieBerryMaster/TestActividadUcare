package com.example.testactividaducare.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estudiante (
    @PrimaryKey
    val cif: Int = 1,
    val apellido: String = "",
    val carrera: String = "",
    val contrasenia: String = "",
    val email: String = "",
    val nombre: String = "",
    val telefono: String = ""
    )