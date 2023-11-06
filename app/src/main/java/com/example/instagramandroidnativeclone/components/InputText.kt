package com.example.instagramandroidnativeclone.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputText(placeHolder: String, textState: MutableState<String>) {
    Row {
        OutlinedTextField(
            placeholder = { Text(placeHolder) },
            shape = RoundedCornerShape(28.dp),
            modifier = Modifier
                .fillMaxWidth(),
            value = textState.value,
            onValueChange = {
                textState.value = it
            },
        )
    }
}