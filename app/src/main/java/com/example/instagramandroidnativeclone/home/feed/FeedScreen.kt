package com.example.instagramandroidnativeclone.home.feed

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.instagramandroidnativeclone.home.feed.stories.Stories
import com.example.instagramandroidnativeclone.home.feed.topbar.TopBar

@Composable
fun FeedScreen() {
    val feedList = remember {
        mutableStateOf(mutableListOf(1, 2, 3, 4))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 5.dp)
    ) {
        TopBar()

        Stories()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()

        ) {
           items(feedList.value){
              Feed()
           }
        }

    }
}