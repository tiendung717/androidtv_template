package com.solid.app.di

import com.solid.app.theme.darkColors
import com.solid.theme.font.googleFontFamily
import com.solid.app.theme.lightColors
import com.solid.theme.colors.ColorSystem
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ThemeModule {

    @Singleton
    @Provides
    fun provideFont() = googleFontFamily("Roboto")

    @Singleton
    @Provides
    fun provideThemeColor() : ColorSystem {
        return ColorSystem(
            light = lightColors,
            dark = darkColors
        )
    }
}