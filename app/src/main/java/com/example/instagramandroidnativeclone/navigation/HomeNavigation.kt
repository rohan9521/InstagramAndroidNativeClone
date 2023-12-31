package com.example.instagramandroidnativeclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.instagramandroidnativeclone.auth.login.Login
import com.example.instagramandroidnativeclone.auth.signup.SignUp
import com.example.instagramandroidnativeclone.home.HomeScreen
import com.example.instagramandroidnativeclone.home.search.Search
import com.example.instagramandroidnativeclone.utils.Screen

@Composable
fun HomeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Auth.route) {
        navigation(startDestination = Screen.Home.ChatScreen.route, route = Screen.Home.ChatScreen.ChatListScreen.route) {

        }
        navigation(startDestination = Screen.Home.ProfileScreen.route, route = Screen.Home.ProfileScreen.route) {

        }
        navigation(startDestination = Screen.Home.ExploreScreen.route, route = Screen.Home.ExploreScreen.route) {

        }
        composable( route = Screen.Home.SearchScreen.route) {
            Search()
        }
        navigation(startDestination = Screen.Home.CreateContent.route, route = Screen.Home.CreateContent.route) {

        }
    }
}