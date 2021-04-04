package com.example.imc_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imc_compose.ui.theme.IMC_COMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMC_COMPOSETheme {

                   NovaHistoria()
                }
            }
        }
    }


@Composable
fun NovaHistoria() {
    Column (


            ){

        Text("Hello ", Modifier.padding(top = 32.dp, bottom = 20.dp, start = 90.dp), )
        Text("VÁVÁ")
        Text("Saudades")
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF009688, widthDp = 140, heightDp = 60)
@Composable
fun DefaultPreview() {
    IMC_COMPOSETheme {
        NovaHistoria()
    }
}