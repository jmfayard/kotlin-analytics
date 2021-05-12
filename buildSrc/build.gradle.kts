plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
    google()
}

object Plugins {
    const val AGP = "4.2.0"
    const val DOKKA = "1.4.32"
    const val KOTLIN = "1.5.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:${Plugins.AGP}")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${Plugins.DOKKA}")
    implementation("org.jetbrains.dokka:dokka-core:${Plugins.DOKKA}")
}
