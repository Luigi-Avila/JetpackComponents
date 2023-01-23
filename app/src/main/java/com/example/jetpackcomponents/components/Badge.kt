package com.example.jetpackcomponents.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyBadgeBox() {
    BadgedBox(modifier = Modifier.padding(16.dp), badge = { Text(text = "5") }) {
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
    }
}