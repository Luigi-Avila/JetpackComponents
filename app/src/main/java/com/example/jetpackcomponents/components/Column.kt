package com.example.jetpackcomponents.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun PreviewColumn(){
    MyColumn()
}

@Composable
fun MyColumn(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()
            ), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo", modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Blue))
    }
}