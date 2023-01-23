package com.example.jetpackcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomponents.ui.model.CheckInfo
import com.example.jetpackcomponents.ui.theme.JetpackComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
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
                        //MyDivider()
                        //MyDropDownMenu()
                        //MySlider()
                        //MyAdvanceSlider()
                        //MyRangeSlider()
                    }
                    var showDialog by rememberSaveable() { mutableStateOf(false) }
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                        Button(onClick = { showDialog = true}) {
                            Text(text = "Show dialog")
                        }
                        /*
                        MyDialog(
                            show = showDialog,
                            onDismiss = { showDialog = false },
                            onConfirm = { Log.i("Luigi", "Confirm click") })

                         */

                        /*
                            MySimpleCustomDialog(show = showDialog, onDismiss = { showDialog = false})
                         */
                        /*
                        MyCustomDialog(show = showDialog, onDismiss = { showDialog = false})

                         */
                        MyConfirmationDialog(show = showDialog, onDismiss = { showDialog = false})
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
        //MyDivider()
        //MyDropDownMenu()
        //MySlider()
        //MyAdvanceSlider()
        //MyRangeSlider()
        //MyDialog(show = true)
        //MyCustomDialog(show = true, onDismiss = { false })
        MyConfirmationDialog(show = true, onDismiss = {true})
    }
}
/**/

