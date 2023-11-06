package com.example.instagramandroidnativeclone.home.feed.stories

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Stories() {
    val storiesList = listOf(
        Story("1"),
        Story("1"),
        Story("1"),
        Story("1"),
        Story("1"),
        Story("1"),
        Story("1"),
        Story("1"),
    )
    LazyRow() {
        items(storiesList){
            StoryView()
        }
    }
}