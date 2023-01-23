package com.example.jetpackcomponents.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Hola mundo")
        Text(text = "Hola mundo", color = Color.Blue)
        Text(text = "Hola mundo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Hola mundo", fontWeight = FontWeight.Light)
        Text(text = "Hola mundo", fontFamily = FontFamily.SansSerif)
        Text(text = "Hola mundo", textDecoration = TextDecoration.LineThrough)
        Text(text = "Hola mundo", textDecoration = TextDecoration.Underline)
        Text(
            text = "Hola mundo", textDecoration = TextDecoration.combine(
                listOf(TextDecoration.Underline, TextDecoration.LineThrough)
            )
        )
        Text(text = "Hola mundo", fontSize = 30.sp)
    }
}