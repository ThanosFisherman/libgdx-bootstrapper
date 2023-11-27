import org.jetbrains.kotlin.fir.declarations.builder.buildScript

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //classpath(project(":dependencies"))
    }
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

}

tasks.withType<Test>().configureEach {
    testLogging { showStandardStreams = true }
}

gradlePlugin {
    plugins {
        create("base-plugin-kotlin") {
            id = "base-plugin-kotlin"
            implementationClass = "BasePluginKotlin"
        }

        create("base-plugin-android") {
            id = "base-plugin-android"
            implementationClass = "BasePluginAndroid"
        }
    }
}