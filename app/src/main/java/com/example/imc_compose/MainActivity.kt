package com.example.imc_compose


import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.imc_compose.composables.LoginPage1
import com.example.imc_compose.ui.theme.IMC_COMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windows = this.window
        windows.statusBarColor = Color.WHITE

        setContent {
            IMC_COMPOSETheme {

                   Surface(color = MaterialTheme.colors.background) {
                       LoginPage1()

                   }
                }
            }
        }
    }



