package com.example.jetpackcomponents.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DividerPreview(){
    MyDivider()
}

@Composable
fun MyDivider() {
    Divider(Modifier.fillMaxWidth().padding(top = 16.dp), color = Color.Red)
}
