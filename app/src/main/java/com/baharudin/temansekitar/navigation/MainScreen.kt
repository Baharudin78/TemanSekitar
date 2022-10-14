package com.baharudin.temansekitar.navigation

import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) {
        //BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavController) {
//    val screen = listOf(
//
//    )
    val navigationBackStack by navController.currentBackStackEntryAsState()
    val currentDestination = navigationBackStack?.destination
    BottomNavigation {
      //  screen
    }
}