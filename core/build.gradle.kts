plugins {
    id("base-plugin-kotlin")
}



val assetsDir = rootProject.files("assets")
sourceSets {
    main {
        resources.srcDir(assetsDir)
    }
}

dependencies {
    addCoreDependencies()
    addCoreKtxDependencies()
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
