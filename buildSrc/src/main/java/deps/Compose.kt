package deps

object Compose : Dependency() {
    object Versions {
        const val composeCompiler = "1.4.7"
        const val composeBom = "2023.08.00"
        const val navigation = "2.7.2"
        const val hiltNavigation = "1.0.0"
        const val constraintLayout = "1.0.0"
        const val activity = "1.5.0-alpha03"
        const val accompanistPager = "0.19.0"
        const val accompanistPermission = "0.22.0-rc"
        const val accompanistSwipeRefresh = "0.24.6-alpha"
        const val liveData = "1.1.1"
        const val googleFont = "1.3.2"
        const val tvCompose = "1.0.0-alpha09"
    }

    private const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"

    private const val ui = "androidx.compose.ui:ui"
    private const val tvFoundation = "androidx.tv:tv-foundation:${Versions.tvCompose}"
    private const val tvMaterial3 = "androidx.tv:tv-material:${Versions.tvCompose}"
    private const val uiPreview = "androidx.compose.ui:ui-tooling-preview"
    private const val material = "androidx.compose.material:material"
    private const val runtime = "androidx.compose.runtime:runtime"
    private const val debugUi = "androidx.compose.ui:ui-tooling"
    private const val uiGraphics = "androidx.compose.ui:ui-graphics"
    private const val materialIcon = "androidx.compose.material:material-icons-extended"
    private const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    private const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}"
    private const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayout}"
    private const val activity = "androidx.activity:activity-compose:${Versions.activity}"
    private const val accompanistSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:${Versions.accompanistSwipeRefresh}"
    private const val googleFont = "androidx.compose.ui:ui-text-google-fonts:${Versions.googleFont}"
    private const val composeLifecycle = "androidx.lifecycle:lifecycle-runtime-compose:2.6.0-beta01"

    override fun implementations() = listOf<String>(
        ui,
        tvFoundation,
        tvMaterial3,
        uiPreview,
        runtime,
        navigation,
        hiltNavigation,
        constraintLayout,
        materialIcon,
        activity,
        accompanistSwipeRefresh,
        googleFont,
        composeLifecycle
    )

    override fun debugImplementations() = listOf<String>(
        debugUi
    )

    override fun platformImplementations() = listOf(composeBom)
}