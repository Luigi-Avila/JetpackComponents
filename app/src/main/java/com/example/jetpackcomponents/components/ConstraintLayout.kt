package com.example.jetpackcomponents.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showSystemUi = true)
@Composable
fun ConstraintLayoutPreview() {
    MyConstaintLayout()
}

@Composable
fun MyConstaintLayout() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxGreen ) = createRefs()

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                start.linkTo(boxRed.end)
                top.linkTo(boxRed.bottom)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                start.linkTo(boxRed.end)
                bottom.linkTo(boxRed.top)
            })

        Box(modifier = Modifier.size(125.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(boxRed.bottom)
            end.linkTo(boxRed.start)

        })

    }
}
