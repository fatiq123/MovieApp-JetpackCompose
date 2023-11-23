package com.example.movieapp_jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieapp_jetpackcompose.presentation.signin_state.SignInScreen
import com.example.movieapp_jetpackcompose.presentation.signup_state.SignUpScreen

@Composable
fun NavigationGraph(navHostController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navHostController,
        startDestination = Screens.SignUpScreen.route
    ) {
        composable(route = Screens.SignInScreen.route) {
            SignInScreen()
        }
        composable(route = Screens.SignUpScreen.route) {
            SignUpScreen(navController = navHostController)
        }
    }
}