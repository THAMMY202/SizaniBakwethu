package com.bakwethu.sizani

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.bakwethu.sizani.app.SizaniBakwethuApp
import com.bakwethu.sizani.ui.theme.SizaniBakwethuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SizaniBakwethuTheme {
                SizaniBakwethuApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SizaniBakwethuTheme {
        SizaniBakwethuApp()
    }
}
