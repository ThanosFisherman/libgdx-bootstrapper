
plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "io.github.thanosfisherman.game.dependencies"
version = "1.0"

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {

}

tasks.withType<Test>().configureEach {
    testLogging { showStandardStreams = true }
}

gradlePlugin {
    plugins {
        register("dependencies") {
            id = "dependencies"
            implementationClass = "io.github.thanosfisherman.game.dependencies.DependenciesPlugin"
        }
    }
}