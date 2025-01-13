package com.pablojesushurtadohidalgo.appi.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.pablojesushurtadohidalgo.appi.ui.screen.DetailScreen.DetailScreen
import com.pablojesushurtadohidalgo.appi.ui.screen.ListaScreen.ListaScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Lista) {
        composable<Lista> {
            ListaScreen { id ->
                navController.navigate(Detail(id))
            }
        }
        composable<Detail> { backStackEntry ->
            val detail = backStackEntry.toRoute<Detail>()
            val id = detail.id
            DetailScreen(id)
        }
    }
}
