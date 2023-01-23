package com.example.jetpackcomponents.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 25.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.Blue,
        contentColor = Color.Green,
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Ejemplo 1")
            Text(text = "Ejemplo 2")
            Text(text = "Ejemplo 3")
        }
    }
}