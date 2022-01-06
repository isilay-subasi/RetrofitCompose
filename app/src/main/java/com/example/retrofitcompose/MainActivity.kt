package com.example.retrofitcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.retrofitcompose.ui.theme.RetrofitComposeTheme

class MainActivity : ComponentActivity() {

    private val BASE_URL = "https://raw.githubusercontent.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    
    Scaffold(topBar = {AppBar()}) {
        
    }

}

@Composable
fun AppBar(){
    TopAppBar() {
        Text(text = "Retrofit Compose")
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RetrofitComposeTheme {
        MainScreen()
    }
}