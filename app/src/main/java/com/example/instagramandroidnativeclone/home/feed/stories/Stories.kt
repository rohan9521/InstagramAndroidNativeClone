package com.example.instagramandroidnativeclone.home.feed.stories

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Stories() {
    val storiesList = remember {
        mutableStateOf(listOf(
            Story("1"),
            Story("1"),
            Story("1"),
            Story("1"),
            Story("1"),
            Story("1"),
            Story("1"),
            Story("1"),
        ))
    }
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.1f)

    ) {
        items(storiesList.value){
            StoryView()
        }
    }
}