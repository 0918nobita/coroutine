plugins {
    application
    kotlin("jvm") version "1.5.10"
}

group = "vision.kodai"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("vision.kodai.coroutine.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
}
