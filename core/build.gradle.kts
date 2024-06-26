plugins {
    `base-plugin-kotlin`
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    addCoreDependencies()
    addCoreKtxDependencies()
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
