package com.solid.theme.colors

import androidx.compose.runtime.staticCompositionLocalOf

data class ColorSystem(
    val light: ColorCollection,
    val dark: ColorCollection
)

data class ColorCollection(
    val project: ColorSet = ColorSet(),
    val text: ColorSet = ColorSet(),
    val background: ColorSet = ColorSet(),
    val divider: ColorSet = ColorSet(),
    val positive: ColorSet = ColorSet(),
    val negative: ColorSet = ColorSet(),
    val warning: ColorSet = ColorSet(),
    val neutral: ColorSet = ColorSet(),
    val textLink: ColorSet = ColorSet(),
    val projectInvert: ColorSet = ColorSet(),
    val textInvert: ColorSet = ColorSet(),
    val backgroundInvert: ColorSet = ColorSet(),
    val dividerInvert: ColorSet = ColorSet(),
    val positiveInvert: ColorSet = ColorSet(),
    val negativeInvert: ColorSet = ColorSet(),
    val warningInvert: ColorSet = ColorSet(),
    val neutralInvert: ColorSet = ColorSet(),
    val textLinkInvert: ColorSet = ColorSet()
)

val defaultCollectionLight = ColorCollection()

val LocalColors = staticCompositionLocalOf { defaultCollectionLight }