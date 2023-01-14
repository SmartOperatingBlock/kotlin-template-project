/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

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
