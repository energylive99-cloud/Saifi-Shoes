package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = SaifiCrimson,
    onPrimary = Color.White,
    primaryContainer = SaifiCrimsonDark,
    onPrimaryContainer = Color.White,
    secondary = SaifiCrimsonLight,
    onSecondary = Color.White,
    tertiary = SaifiNeonGlow,
    onTertiary = Color.White,
    background = DarkBackground,
    onBackground = TextPrimaryDark,
    surface = DarkSurface,
    onSurface = TextPrimaryDark,
    surfaceVariant = DarkSurfaceElevated,
    onSurfaceVariant = TextSecondaryDark,
    outline = DarkSurfaceBorder
)

private val LightColorScheme = lightColorScheme(
    primary = SaifiCrimson,
    onPrimary = Color.White,
    primaryContainer = SaifiCrimsonLight,
    onPrimaryContainer = Color.White,
    secondary = SaifiCrimsonDark,
    onSecondary = Color.White,
    tertiary = SaifiNeonGlow,
    onTertiary = Color.White,
    background = LightBackground,
    onBackground = TextPrimaryLight,
    surface = LightSurface,
    onSurface = TextPrimaryLight,
    surfaceVariant = Color(0xFFF3F4F6),
    onSurfaceVariant = TextSecondaryLight,
    outline = Color(0xFFE5E7EB)
)

@Composable
fun SaifiShoesTheme(
    darkTheme: Boolean = true, // Default to sleek brand dark aesthetic
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

// Alias for initial template compatibility
@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    SaifiShoesTheme(darkTheme = darkTheme, content = content)
}

