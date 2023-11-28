plugins {
    //id("com.android.application") version Versions.Plugins.agpVersion apply false
    //id("com.android.library") version Versions.Plugins.agpVersion apply false
//    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
//    id("org.jetbrains.kotlin.jvm") version "1.9.21" apply false
    id("game.dependencies")
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
    }
}
