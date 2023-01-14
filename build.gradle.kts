plugins {
  application
    alias(libs.plugins.kotlin.jvm)
}

group = "io.github.smartoperatingblock"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
}
