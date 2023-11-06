package com.example.instagramandroidnativeclone.home.feed.stories

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun StoryView() {
    Row(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)

    ) {
        AsyncImage(
            model = "data:image/jpeg;base64,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",
            contentDescription ="Story",
            modifier = Modifier
                .background(shape = CircleShape, color = Color.Blue)
        )
    }
}