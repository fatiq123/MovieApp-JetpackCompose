package com.example.movieapp_jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph(navHostController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navHostController,
        startDestination = Screens.SignUpScreen.route
    ) {
        composable(route = Screens.SignUpScreen.route) {

        }
        composable(route = Screens.SignUpScreen.route) {

        }
    }
}