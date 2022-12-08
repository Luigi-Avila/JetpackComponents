package com.example.jetpackcomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun MySlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by rememberSaveable { mutableStateOf(0f) }
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun MyAdvanceSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by rememberSaveable { mutableStateOf(0f) }
        var completeValue by rememberSaveable { mutableStateOf("") }
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..10f,
            steps = 9,
            onValueChangeFinished = { completeValue = sliderPosition.toString() })
        Text(text = completeValue)
    }
}