package com.bakwethu.sizani.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bakwethu.sizani.components.BottomComponent
import com.bakwethu.sizani.components.HeadingTextComponent
import com.bakwethu.sizani.components.MyTextFieldComponent
import com.bakwethu.sizani.components.NormalTextComponent
import com.bakwethu.sizani.components.PasswordTextFieldComponent

@Composable
fun LoginScreen(navController: NavHostController) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column {
                NormalTextComponent(value = "Hey, there")
                HeadingTextComponent(value = "Welcome Back")
            }
            Spacer(modifier = Modifier.height(25.dp))
            Column {
                MyTextFieldComponent(labelValue = "Email", icon = Icons.Outlined.Email)
                Spacer(modifier = Modifier.height(10.dp))
                PasswordTextFieldComponent(labelValue = "Password", icon = Icons.Outlined.Lock)
            }
            BottomComponent(
                textQuery = "Don't have an account? ",
                textClickable = "Register",
                action = "Login",
                navController
            )
        }
    }
}