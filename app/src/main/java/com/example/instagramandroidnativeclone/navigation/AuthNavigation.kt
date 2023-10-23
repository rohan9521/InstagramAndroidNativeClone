package com.example.instagramandroidnativeclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.instagramandroidnativeclone.auth.login.Login
import com.example.instagramandroidnativeclone.auth.signup.SignUp
import com.example.instagramandroidnativeclone.home.HomeScreen
import com.example.instagramandroidnativeclone.utils.Screen

@Composable
fun AuthNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Auth.route) {
        navigation(startDestination = Screen.Auth.LoginScreen.route, route = Screen.Auth.route) {
            composable(route = Screen.Auth.LoginScreen.route) {
                Login()
            }
            composable(route = Screen.Auth.SignUpScreen.route) {
                SignUp()
            }
        }
        composable(route = Screen.Home.HomeScreen.route) {
            HomeScreen()
        }
    }
}