plugins {
    application
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.qa)
}

group = "io.github.smartoperatingblock"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
}
