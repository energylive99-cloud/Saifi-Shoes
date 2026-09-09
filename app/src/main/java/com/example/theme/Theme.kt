package com.example.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ==========================================
// 1. BRAND & THEME COLORS
// ==========================================
val SaifiCrimson = Color(0xFFCD3134)
val SaifiCrimsonDark = Color(0xFF9E1B1D)
val SaifiCrimsonLight = Color(0xFFE24C50)
val SaifiNeonGlow = Color(0xFFFF3B5C)
val SaifiNeonGlowSubtle = Color(0x33FF3B5C)

// Dark Theme Surfaces & Canvas
val SaifiDarkBackground = Color(0xFF0D0F13)
val SaifiDarkSurface = Color(0xFF15181E)
val SaifiDarkSurfaceElevated = Color(0xFF1C2028)
val SaifiDarkSurfaceBorder = Color(0xFF282E3A)

// Text Colors (Dark Mode)
val SaifiTextPrimaryDark = Color(0xFFF5F6F8)
val SaifiTextSecondaryDark = Color(0xFF9BA2AF)
val SaifiTextMutedDark = Color(0xFF6B7280)

// Light Theme Colors
val SaifiLightBackground = Color(0xFFF9FAFB)
val SaifiLightSurface = Color(0xFFFFFFFF)
val SaifiLightSurfaceElevated = Color(0xFFF3F4F6)
val SaifiLightSurfaceBorder = Color(0xFFE5E7EB)
val SaifiTextPrimaryLight = Color(0xFF111418)
val SaifiTextSecondaryLight = Color(0xFF4B5563)

val DarkColorScheme: ColorScheme = darkColorScheme(
    primary = SaifiCrimson,
    onPrimary = Color.White,
    primaryContainer = SaifiCrimsonDark,
    onPrimaryContainer = Color.White,
    secondary = SaifiCrimsonLight,
    onSecondary = Color.White,
    tertiary = SaifiNeonGlow,
    onTertiary = Color.White,
    background = SaifiDarkBackground,
    onBackground = SaifiTextPrimaryDark,
    surface = SaifiDarkSurface,
    onSurface = SaifiTextPrimaryDark,
    surfaceVariant = SaifiDarkSurfaceElevated,
    onSurfaceVariant = SaifiTextSecondaryDark,
    outline = SaifiDarkSurfaceBorder
)

val LightColorScheme: ColorScheme = lightColorScheme(
    primary = SaifiCrimson,
    onPrimary = Color.White,
    primaryContainer = SaifiCrimsonLight,
    onPrimaryContainer = Color.White,
    secondary = SaifiCrimsonDark,
    onSecondary = Color.White,
    tertiary = SaifiNeonGlow,
    onTertiary = Color.White,
    background = SaifiLightBackground,
    onBackground = SaifiTextPrimaryLight,
    surface = SaifiLightSurface,
    onSurface = SaifiTextPrimaryLight,
    surfaceVariant = SaifiLightSurfaceElevated,
    onSurfaceVariant = SaifiTextSecondaryLight,
    outline = SaifiLightSurfaceBorder
)

// ==========================================
// 2. MATERIAL 3 SHAPES
// ==========================================
val SaifiShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(14.dp),
    large = RoundedCornerShape(20.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

// ==========================================
// 3. MATERIAL 3 TYPOGRAPHY
// ==========================================
val SaifiTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = (-0.5).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.15.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

// ==========================================
// 4. MAIN THEME COMPOSABLE
// ==========================================
@Composable
fun SaifiShoesTheme(
    darkTheme: Boolean = true, // Default to brand dark luxury aesthetic
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = SaifiTypography,
        shapes = SaifiShapes,
        content = content
    )
}

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    SaifiShoesTheme(darkTheme = darkTheme, content = content)
}
