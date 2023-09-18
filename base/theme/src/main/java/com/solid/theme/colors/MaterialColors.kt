package com.solid.theme.colors

import androidx.tv.material3.ColorScheme
import androidx.tv.material3.ExperimentalTvMaterial3Api

@OptIn(ExperimentalTvMaterial3Api::class)
fun materialColors(colors: ColorCollection) : ColorScheme = ColorScheme(
    surfaceTint = colors.background.Weaker,
    onErrorContainer = colors.negativeInvert.Stronger,
    onError = colors.negativeInvert.Stronger,
    errorContainer = colors.negative.Stronger,
    onTertiaryContainer = colors.text.Stronger,
    onTertiary = colors.text.Stronger,
    tertiaryContainer = colors.project.Stronger,
    tertiary = colors.project.Normal,
    error = colors.negative.Stronger,
    border = colors.divider.Strong,
    onBackground = colors.text.Stronger,
    background = colors.background.Weaker,
    inverseOnSurface = colors.background.Weaker,
    inverseSurface = colors.backgroundInvert.Weaker,
    onSurfaceVariant = colors.text.Strong,
    onSurface = colors.text.Stronger,
    surfaceVariant = colors.background.Weak,
    surface = colors.background.Normal,
    onSecondaryContainer = colors.text.Normal,
    onSecondary = colors.text.Normal,
    secondaryContainer = colors.background.Normal,
    secondary = colors.background.Normal,
    inversePrimary = colors.text.Stronger,
    onPrimaryContainer = colors.text.Stronger,
    onPrimary = colors.text.Stronger,
    primaryContainer = colors.background.Weaker,
    primary = colors.project.Normal,
    scrim = colors.background.Weaker,
    borderVariant = colors.divider.Normal
)