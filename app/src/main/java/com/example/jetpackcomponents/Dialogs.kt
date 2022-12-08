package com.example.jetpackcomponents

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable

@Composable
fun MyDialog(show: Boolean, onDismiss: () -> Unit, onConfirm: () -> Unit) {
    if (show) {
        AlertDialog(
            onDismissRequest = { onDismiss()},
            title = { Text(text = "Titulo") },
            text = { Text(text = "Hola mundo soy una descripcion") },
            confirmButton = {
                TextButton(onClick = { onConfirm()}) {
                    Text(text = "ConfirmButton")
                }
            }, dismissButton = {
                TextButton(onClick = {onDismiss()}) {
                    Text(text = "DismissButton")
                }
            }
        )
    }
}