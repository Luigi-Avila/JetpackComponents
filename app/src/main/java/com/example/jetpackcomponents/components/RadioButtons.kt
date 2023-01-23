package com.example.jetpackcomponents.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRadioButtonStateHosting(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name === "Aris", onClick = { onItemSelected("Aris") })
            Text(text = "Aris")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name === "David", onClick = { onItemSelected("David") })
            Text(text = "David")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name === "Luis", onClick = { onItemSelected("Luis") })
            Text(text = "Luis")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name === "Angel", onClick = { onItemSelected("Angel") })
            Text(text = "Angel")
        }
    }
}

@Composable
fun MyRadioButton() {
    var status by rememberSaveable { mutableStateOf(false) }
    Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = status,
            onClick = { status = !status },
            enabled = true,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledColor = Color.Green
            )
        )
        Text(text = "Hola Mundo")
    }
}