package com.example.instagramandroidnativeclone.navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.instagramandroidnativeclone.home.HomeScreen
import com.example.instagramandroidnativeclone.home.chat.chatlist.ChatList
import com.example.instagramandroidnativeclone.home.chat.chatroom.ChatRoom
import com.example.instagramandroidnativeclone.home.explore.Explore
import com.example.instagramandroidnativeclone.home.feed.FeedScreen
import com.example.instagramandroidnativeclone.home.profile.Profile
import com.example.instagramandroidnativeclone.home.search.Search
import com.example.instagramandroidnativeclone.utils.Screen

@Composable
fun HomeNavigation(navController: NavHostController){

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        navigation(startDestination = Screen.Home.HomeScreen.route, route = Screen.Home.route) {
            composable(route = Screen.Home.HomeScreen.route){
                FeedScreen()
            }
        }

        navigation(startDestination = Screen.Home.Chat.ChatListScreen.route, route = Screen.Home.Chat.route) {
            composable(route = Screen.Home.Chat.ChatListScreen.route){
                ChatList()
            }
            composable(route = Screen.Home.Chat.ChatRoomScreen.route){
                ChatRoom()
            }
        }
        navigation(startDestination = Screen.Home.Profile.ProfileMainScreen.route, route = Screen.Home.Profile.route) {
            composable(route = Screen.Home.Profile.ProfileMainScreen.route){
                Profile()
            }
        }
        navigation(startDestination = Screen.Home.Explore.ExploreMainScreen.route, route = Screen.Home.Explore.route) {
            composable(route = Screen.Home.Explore.ExploreMainScreen.route){
                Explore()
            }
        }
        composable( route = Screen.Home.Search.route) {
            Search()
        }
        navigation(startDestination = Screen.Home.CreateContent.CreateContentMainScreen.route, route = Screen.Home.CreateContent.route) {
            composable(route = Screen.Home.CreateContent.CreateContentMainScreen.route){
                Row() {
                    
                }
            }
        }
    }
}