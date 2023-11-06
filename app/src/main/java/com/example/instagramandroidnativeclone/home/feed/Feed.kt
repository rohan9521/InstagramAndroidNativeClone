package com.example.instagramandroidnativeclone.home.feed

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Feed() {
    Spacer(modifier = Modifier
        .padding(5.dp))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .border(BorderStroke(1.dp, Color.Gray), shape = RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .border(BorderStroke(1.dp,Color.Blue))

        ) {

            AsyncImage(
                model = "https://i.insider.com/5267dfc16bb3f78b25452735?width=700",
                contentDescription = "Translated description of what the image contains",
               contentScale = ContentScale.None,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)

            )
        }
        Spacer(modifier = Modifier
            .padding(5.dp))
    }
}