package com.example.instagramandroidnativeclone.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.instagramandroidnativeclone.home.homescreen.BottomBar
import com.example.instagramandroidnativeclone.navigation.HomeNavigation

@Composable
fun HomeScreen(){
    val navController = rememberNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.93f)
                .border(BorderStroke(2.dp, Color.Blue))

        ) {
          HomeNavigation(navController)
        }
        BottomBar(navController)
    }
}