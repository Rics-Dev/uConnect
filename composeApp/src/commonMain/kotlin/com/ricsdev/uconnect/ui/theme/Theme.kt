package com.ricsdev.uconnect.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun UConnectTheme(
    content: @Composable () -> Unit
) {


    val darkTheme = isSystemInDarkTheme()

    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }


    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}