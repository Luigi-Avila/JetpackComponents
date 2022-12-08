package com.example.jetpackcomponents

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomponents.ui.model.CheckInfo
import com.example.jetpackcomponents.ui.theme.JetpackComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //MyText()
                    //MyTextField()
                    //MyTextFieldAdvance()
                    /*Column() {
                        MyTextFieldOutlined()
                    } */

                    /* ESTATE HOSTING
                    var myText by rememberSaveable { mutableStateOf("") }
                    MyTextField(myText) { myText = it }
                     */

                    //MyButtonExample()

                    //MyProgress()
                    //MyCheckBoxWithText()

                    /*
                    val options = getOptions(titles = listOf("Hi", "programmer", "list", "check"))
                    Column() {
                        options.forEach {
                            MyCheckBoxWithTextAdvance(checkInfo = it)
                        }
                    } */

                    //MyTriStatusCheckBox()

                    //MyRadioButton()

                    // Multiple Radio button With State Hosting
                    /* var selected by rememberSaveable { mutableStateOf("Angel") }
                    MyRadioButtonStateHosting(name = selected, onItemSelected = { selected = it })

                     */
                    Column {
                        //MyCard()
                        //MyBadgeBox()
                        MyDivider()
                    }
                }
            }
        }
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            name = it,
            selected = status,
            onCheckedChange = { myNewStatus -> status = myNewStatus })
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComponentsTheme {
        //MyText()
        //MyTextField()
        //MyTextFieldAdvance()
        //MyTextFieldOutlined()
        //MyButtonExample()
        //MyImageAdvance()
        //MyIcon()
        //MyProgress()
        //MyProgressAdvance()
        //MySwitch()
        //MyCheckBox()
        //MyCheckBoxWithText()
        //MyCard()
        //MyBadgeBox()
        MyDivider()
    }
}
/**/

@Composable
fun MyDivider(){
    Divider(Modifier.padding(16.dp), color = Color.Blue)
}

@Composable
fun MyBadgeBox() {
    BadgedBox(modifier = Modifier.padding(16.dp), badge = { Text(text = "5")}) {
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
    }
}


@Composable
fun MyCard() {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 25.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.Blue,
        contentColor = Color.Green,
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Ejemplo 1")
            Text(text = "Ejemplo 2")
            Text(text = "Ejemplo 3")
        }
    }
}

@Composable
fun MyRadioButtonStateHosting(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxSize()) {
        Row() {
            RadioButton(selected = name === "Aris", onClick = { onItemSelected("Aris") })
            Text(text = "Aris")
        }
        Row() {
            RadioButton(selected = name === "David", onClick = { onItemSelected("David") })
            Text(text = "David")
        }
        Row() {
            RadioButton(selected = name === "Luis", onClick = { onItemSelected("Luis") })
            Text(text = "Luis")
        }
        Row() {
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

@Composable
fun MyTriStatusCheckBox() {
    var status by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = status, onClick = {
        status = when (status) {
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun MyCheckBoxWithTextAdvance(checkInfo: CheckInfo) {
    Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = checkInfo.name)
    }
}

@Composable
fun MyCheckBoxWithText() {
    var state by rememberSaveable { mutableStateOf(false) }
    Column() {
        Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = state, onCheckedChange = { state = !state })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Esto es un ejemplo")
        }
    }

}

@Composable
fun MyCheckBox() {
    var state by rememberSaveable { mutableStateOf(false) }
    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Red,
            uncheckedColor = Color.Yellow,
            checkmarkColor = Color.Blue
        )
    )
}

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

@Composable
fun MyProgressAdvance() {
    var progress by rememberSaveable() { mutableStateOf(0f) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progress)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Button(onClick = { progress += 0.1f }) {
                Text(text = "Incrementat")
            }
            Button(onClick = { progress -= 0.1f }) {
                Text(text = "Reducir")
            }
        }
    }
}


@Composable
fun MyProgress() {

    var showLoading by rememberSaveable() { mutableStateOf(false) }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 5.dp)
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 40.dp),
                color = Color.Green,
                backgroundColor = Color.Yellow
            )
        }

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Activar loading")
        }

    }
}

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icon",
        tint = Color.Yellow
    )
}


@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        //modifier = Modifier.clip(RoundedCornerShape(25f))
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        alpha = 0.5f
    )
}


@Composable
fun MyButtonExample() {
    var enable by rememberSaveable { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enable = false },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = Color.White
            ),
            border = BorderStroke(5.dp, Color.Black),
            enabled = enable
        ) {
            Text(text = "Pulsar")
        }

        OutlinedButton(
            onClick = { enable = false }, enabled = enable, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Cyan,
                contentColor = Color.Black,
                disabledBackgroundColor = Color.White,
                disabledContentColor = Color.Blue
            )
        ) {
            Text(text = "Hola")
        }

        TextButton(onClick = { }) {
            Text(text = "Text Button")
        }

    }
}


@Composable
fun MyTextFieldOutlined() {
    var myText by rememberSaveable { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Introduce your info") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Green,
            unfocusedBorderColor = Color.Blue
        )
    )
}

@Composable
fun MyTextFieldAdvance() {
    var myText by rememberSaveable { mutableStateOf("") }

    TextField(value = myText, onValueChange = {
        myText = if (it.contains("a")) {
            it.replace("a", "")
        } else {
            it
        }
    }, label = { Text(text = "Introduce your name") })
}

@Composable
fun MyTextField(name: String, onValueChange: (String) -> Unit) {
    TextField(value = name, onValueChange = { onValueChange(it) })
}


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

