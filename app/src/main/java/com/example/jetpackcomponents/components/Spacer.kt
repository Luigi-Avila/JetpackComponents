package com.example.jetpackcomponents.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun SpacerPreview(){
    Column(Modifier.fillMaxSize()) {
        MySpacer(size = 20)
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Red))
        MySpacer(size = 8)
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Blue))
    }

}

@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}
