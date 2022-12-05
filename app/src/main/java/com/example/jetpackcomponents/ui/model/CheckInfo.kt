package com.example.jetpackcomponents.ui.model

data class CheckInfo(
    val name: String,
    var selected: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)