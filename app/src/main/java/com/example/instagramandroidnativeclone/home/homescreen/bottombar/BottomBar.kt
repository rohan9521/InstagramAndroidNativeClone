package com.example.instagramandroidnativeclone.home.homescreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.instagramandroidnativeclone.R
import com.example.instagramandroidnativeclone.home.homescreen.bottombar.BottomNavItem
import com.example.instagramandroidnativeclone.utils.Screen

@Composable
fun BottomBar(navHostController: NavHostController) {
    val backStackEntry = navHostController?.currentBackStackEntryAsState()
    val selectedRoute = remember {
        mutableStateOf(Screen.Home.HomeScreen.route)
    }
    val bottomNavList = listOf(
        BottomNavItem(
            Screen.Home.HomeScreen.route,
            R.drawable.ic_baseline_home_24,
            true
        ),
        BottomNavItem(
            Screen.Home.Search.route,
            R.drawable.ic_baseline_search_24,
            false
        ),
        BottomNavItem(
            Screen.Home.Explore.route,
            R.drawable.ic_baseline_camera_roll_24,
            false
        ),
        BottomNavItem(
            Screen.Home.Chat.route,
            R.drawable.ic_baseline_send_24,
            false
        ),
        BottomNavItem(
            Screen.Home.Profile.route,
            R.drawable.ic_baseline_person_24,
            false
        ),
    )
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .border(BorderStroke(2.dp, Color.Blue))
    ) {
        bottomNavList.forEach { bottomNavItem->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight()

            ) {
                Image(
                    painter = painterResource(id = bottomNavItem.icon),
                    contentDescription = "Home",
                    colorFilter = ColorFilter.tint(if(bottomNavItem.route == selectedRoute.value) Color.Magenta else Color.Black),
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .clickable {
                            selectedRoute.value = bottomNavItem.route
                            backStackEntry?.value?.destination?.route = bottomNavItem.route
                        }
                )
            }
        }
    }
}