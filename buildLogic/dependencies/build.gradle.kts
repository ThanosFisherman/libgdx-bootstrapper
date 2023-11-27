
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
tasks.getByName<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
gradlePlugin {
    plugins {
        register("dependencies") {
            id = "game.dependencies"
            implementationClass = "io.github.thanosfisherman.game.dependencies.DependenciesPlugin"
        }
    }
}