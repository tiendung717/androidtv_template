package com.solid.theme.di

import android.content.Context
import androidx.compose.ui.text.font.FontFamily
import com.solid.theme.colors.ColorSystem
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent


@EntryPoint
@InstallIn(SingletonComponent::class)
interface ComposeThemeEntryPoint {
    fun fontFamily(): FontFamily
    fun themeColor(): ColorSystem
}

fun Context.fontFamily(): FontFamily {
    val entryPoint = EntryPointAccessors.fromApplication(this, ComposeThemeEntryPoint::class.java)
    return entryPoint.fontFamily()
}

fun Context.themeColor(): ColorSystem {
    val entryPoint = EntryPointAccessors.fromApplication(this, ComposeThemeEntryPoint::class.java)
    return entryPoint.themeColor()
}