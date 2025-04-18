package com.bakwethu.sizani.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.bakwethu.sizani.screens.Navigation

@Composable
fun SizaniBakwethuApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Navigation()
    }
}
