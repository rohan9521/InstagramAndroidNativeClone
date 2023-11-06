package com.example.instagramandroidnativeclone.auth.signup

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.instagramandroidnativeclone.components.InputText

@Composable
fun SignUp() {
    val userNameMutableState = remember {mutableStateOf("")}
    val passwordMutableState = remember {mutableStateOf("")}
    val emailMutableState =remember {mutableStateOf("")}
    val profileImageMutableState = remember {
        mutableStateOf<Uri?>(null)
    }
    val singlePhotoPicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickVisualMedia(),
        onResult = {uri-> profileImageMutableState.value = uri}
    )

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
            modifier = Modifier
                .fillMaxHeight()
        ) {
            InputText(placeHolder = "UserName", textState = userNameMutableState)
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            InputText(placeHolder = "Password", textState = passwordMutableState)
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            InputText(placeHolder = "Email", textState = emailMutableState)
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Button(
                content = { Text("Upload Profile Picture") },
                onClick = {
                          singlePhotoPicker.launch(
                              PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                          )
                },
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )
            Button(
                content = { Text("SignUp") },
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(text = "Already have an account? Log In")
        }

    }

}