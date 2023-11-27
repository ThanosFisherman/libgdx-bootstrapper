plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("game.dependencies")
}

group = "io.github.thanosfisherman.game.plugins"
version = "1.0"

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(Dependencies.Plugins.ANDROID_GRADLE_PLUGIN)
    implementation(Dependencies.Plugins.KOTLIN_GRADLE_PLUGIN)
    implementation("io.github.thanosfisherman.game.dependencies:dependencies:1.0")

}

tasks.withType<Test>().configureEach {
    testLogging { showStandardStreams = true }
}

gradlePlugin {
    plugins {
        register("base-plugin-kotlin") {
            id = "base-plugin-kotlin"
            implementationClass = "io.github.thanosfisherman.game.plugins.BasePluginKotlin"
        }

        register("base-plugin-android") {
            id = "base-plugin-android"
            implementationClass = "io.github.thanosfisherman.game.plugins.BasePluginAndroid"
        }
    }
}