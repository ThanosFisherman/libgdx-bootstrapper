import org.gradle.api.JavaVersion
import org.gradle.jvm.toolchain.JavaLanguageVersion

object Versions {

    // region Common

    const val kotlin = "2.1.0"
    const val coroutines = "1.10.2"
    const val kotlinxDateTime = "0.3.0"
    const val kotlinSerialization = "1.6.3"
    const val navigation = "2.5.3"


    // endregion

    object Android {
        const val compileSdkVersion = 35
        const val minSdkVersion = 24
        const val targetSdkVersion = 35
    }

    object Plugins {
        const val agpVersion = "8.9.2"

        const val undercouch = "5.6.0"
        const val grettyVersion = "3.1.5"
    }

    object Libgdx {
        const val ashleyVersion = "1.7.4"
        const val gdxVersion = "1.13.5"
        const val gdxControllersVersion = "2.2.1"
        const val gdxControllerUtilsVersion = "2.3.0"
        const val ktxVersion = "1.13.1-rc1"
        const val gdxTeaVMVersion = "1.2.0"
        const val teaVMVersion = "0.12.0"
        const val box2dlightsVersion = "1.5"
        const val aiVersion = "1.8.2"
        const val kryoVersion = "5.5.0"
        const val kryoNetVersion = "kryoNetVersion"
        const val websocketVersion = "1.9.10.3"
        const val gdxGltfVersion = "2.1.0"
        const val digitalVersion = "0.4.4"
        const val funderbyVersion = "funderbyVersion"
        const val jdkgdxdsVersion = "1.7.2"
        const val kryoJdkgdxdsVersion = "1.4.4.0"
        const val visUiVersion = "1.5.3"
        const val miniaudioVersion = "0.3"
        const val universalTweenVersion = "6.3.3"
        const val graalVersion = "2.0.1"
        const val ode4jVersion = "master-SNAPSHOT"
        const val juniperVersion = "0.6.7"
        const val juniperDigitalVersion = "0.6.2"
    }


    object Target {
        const val jvmTarget = "21"
        const val compileSdkVersion = 35
        const val minSdkVersion = 24
        const val targetSdkVersion = 35
        val sourceCompatibility = JavaVersion.VERSION_21
        val targetCompatibility = JavaVersion.VERSION_21
        val javaToolchainVersion = JavaLanguageVersion.of(21)
    }
}
