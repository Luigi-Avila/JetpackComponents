package com.example.jetpackcomponents.components

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun MySwitch() {
    var state by rememberSaveable() { mutableStateOf(false) }
    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = false,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            checkedThumbColor = Color.Green,
            uncheckedTrackColor = Color.Magenta,
            checkedTrackColor = Color.Cyan,
            checkedTrackAlpha = 0.1f,
            uncheckedTrackAlpha = 0.1f,
            disabledCheckedThumbColor = Color.Yellow,
            disabledCheckedTrackColor = Color.Yellow
        )
    )
}