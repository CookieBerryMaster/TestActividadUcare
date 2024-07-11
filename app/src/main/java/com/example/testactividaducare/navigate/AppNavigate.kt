package com.example.testactividaducare.navigate

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testactividaducare.screen.ActionButtons
import com.example.testactividaducare.screen.CrearActividad
import com.example.testactividaducare.screen.PantallaActividad

@Composable
fun AppNavigate() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { PantallaActividad(navController = navController, padding = PaddingValues()) }
        composable("crearActividad") { CrearActividad(navController) }
    }
}