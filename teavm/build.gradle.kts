plugins {
    `base-plugin-kotlin`
}

group = "io.github.thanosfisherman.game.teavm"
version = "1.0-SNAPSHOT"

dependencies {
    addTeaVMDependencies()
}

val buildJavaScript = tasks.register<JavaExec>("buildGdxTeaVM") {
    val mainClassName = "io.github.thanosfisherman.game.teavm.TeaVMBuilder"
    dependsOn(tasks.classes)
    description = "Transpile bytecode to JavaScript via TeaVM"
    mainClass.set(mainClassName)
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.build.configure { dependsOn(buildJavaScript) }