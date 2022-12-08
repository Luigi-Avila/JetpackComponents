package com.example.jetpackcomponents

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun MyConfirmationDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                MyTitleDialog(text = "Phone Ringtone", modifier = Modifier.padding(24.dp))
                Divider(Modifier.fillMaxWidth(), Color.Gray)
                var name by rememberSaveable { mutableStateOf("") }
                MyRadioButtonStateHosting(name = name, onItemSelected = { name = it })
                Divider(Modifier.fillMaxWidth(), Color.Gray)
                Row(Modifier.align(Alignment.End).padding(8.dp)) {
                    TextButton(onClick = { }) {
                        Text(text = "Cancelar")
                    }
                    TextButton(onClick = { }) {
                        Text(text = "Aceptar")
                    }
                }
            }
        }
    }
}

@Composable
fun MyCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(
            onDismissRequest = { onDismiss() },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
                    .background(Color.White)
            ) {
                MyTitleDialog(text = "Ejemplo")
                MyAccountItem(email = "Ejemplo1@gmail.com", drawable = R.drawable.avatargo)
                MyAccountItem(email = "Ejemplo2@gmail.com", drawable = R.drawable.avatargo)
                MyAccountItem(email = "Ejemplo3@gmail.com", drawable = R.drawable.avatargo)
            }

        }
    }
}


@Composable
fun MySimpleCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(
            onDismissRequest = { onDismiss() },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
                    .background(Color.White)
            ) {
                Text(text = "Ejemplo 1")
                Text(text = "Ejemplo 2")
                Text(text = "Ejemplo 3")
                Text(text = "Ejemplo 4")
                Text(text = "Ejemplo 5")
            }
        }
    }
}


@Composable
fun MyDialog(show: Boolean, onDismiss: () -> Unit, onConfirm: () -> Unit) {
    if (show) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = { Text(text = "Titulo") },
            text = { Text(text = "Hola mundo soy una descripcion") },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "ConfirmButton")
                }
            }, dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "DismissButton")
                }
            }
        )
    }
}


@Composable
fun MyAccountItem(email: String, @DrawableRes drawable: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawable),
            contentScale = ContentScale.Crop,
            contentDescription = "Avatar",
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
                .padding(8.dp)
        )
        Text(text = email, fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun MyTitleDialog(text: String, modifier: Modifier = Modifier.padding(bottom = 12.dp)) {
    Text(
        text = text,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
    )
}