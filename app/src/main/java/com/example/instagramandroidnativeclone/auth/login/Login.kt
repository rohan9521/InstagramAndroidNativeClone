package com.example.instagramandroidnativeclone.auth.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.example.instagramandroidnativeclone.components.InputText

@Composable
fun Login() {
    val userNameMutableState = mutableStateOf("")
    val passwordMutableState = mutableStateOf("")

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .border(BorderStroke(1.dp, Color.Red))
            .padding(10.dp)
    ) {
        AsyncImage(
            model = "https://akm-img-a-in.tosshub.com/businesstoday/images/story/202212/instagram-users-irked-with-the-new-update-sixteen_nine.jpg?size=1200:675",
            contentDescription = "Translated description of what the image contains",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.4f)
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxHeight(.6f)
        ) {
            InputText(placeHolder = "UserName", textState = userNameMutableState)
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            InputText(placeHolder = "Password", textState = passwordMutableState)
            Button(
                content = { Text("Login") },
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Text(text = "Don't have an account? SignUp")
        }

    }

}
