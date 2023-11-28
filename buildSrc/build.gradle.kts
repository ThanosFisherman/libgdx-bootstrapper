plugins {
    `kotlin-dsl`
    id("game.dependencies")
}

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("io.github.thanosfisherman.game.dependencies:dependencies:1.0")
}

tasks.withType<Test>().configureEach {
    testLogging { showStandardStreams = true }
}

gradlePlugin {
}
