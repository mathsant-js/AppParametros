package com.example.appparametros.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.appparametros.ui.screen.LoginScreen


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.LoginScreen.route) {
        composable(route = Screens.LoginScreen.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screens.HomeScreen.route, arguments = listOf(
            navArgument(USER) {
                type = NavType.StringType
                defaultValue = ""
                nullable = true
            }
        )) {
            HomeRoute(userName = it.arguments?.getString(USER) ?: "")
        }
    }
}