import org.gradle.api.JavaVersion

object Config {
    val minSdk = 23
    val compileSdk = 28
    val targetSdk = 28
    val javaVersion = JavaVersion.VERSION_1_8
    val buildTools = "28.0.3"
}

object Versions {
    val lotteVersion: String = "3.4.0"
    val GlideVersion: String = "4.12.0"
    val hiltVersion = "2.38.1"

    // <editor-fold desc="google">
    val androidx_core = "1.6.1"
    val androidx_recyclerview = "1.0.0"
    val androidx_navigation = "2.4.2"
    val androidx_constraintLayout = "1.1.3"
    val material = "1.1.0-alpha04"
    // </editor-fold>

    // <editor-fold desc="testing">
    val junit = "4.12"
    val androidx_espresso = "3.1.0"
    val androidx_testing = "1.1.1"
    //</editor-fold>

    // <editor-fold desc="tools">
    val gradleandroid = "3.5.0"
    val kotlin = "1.3.20"
    val gradleversions = "0.21.0"
    // </editor-fold>

}

object Deps {
    val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
    val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
    val androidx_material = "com.google.android.material:material:${Versions.material}"
    val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
    val androidx_navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation}"
    val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"

    val testlib_junit = "junit:junit:${Versions.junit}"

    val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
    val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
    val testandroidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"

    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val tools_gradleversions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleversions}"


    val hilt_implementation  = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    val hilt_kapt  = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
    val hilt_viewmodel_implementation = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    val hilt_viewmodel_kapt = "androidx.hilt:hilt-compiler:1.0.0"



    val glide_implementation  = "com.github.bumptech.glide:glide:${Versions.GlideVersion}"
    val glidekapt_implementation  = "com.google.dagger:hilt-android:${Versions.hiltVersion}"

    val lotte_implementation  = "com.airbnb.android:lottie:${Versions.lotteVersion}"

}
