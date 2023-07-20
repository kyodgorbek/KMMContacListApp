package com.example.kmmcontacllistapp.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.kmmcontacllistapp.ui.theme.DarkColorScheme
import com.example.kmmcontacllistapp.ui.theme.LightColorScheme
import com.example.kmmcontacllistapp.ui.theme.Typography

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}