import java.net.URI

plugins {
    alias(libs.plugins.comAndroidLibrary)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.ioGitlabArturboschDetekt)
    alias(libs.plugins.orgJmailenKotlinter)
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose)
    id("com.rjspies.fontue") version "1.0.0"
}

fontueConfiguration {
    fontUri.set(URI.create("https://phosphoricons.com/assets/phosphor-icons.zip"))
    targetDirectory.set(file("src/main/res/font"))
}

android {
    namespace = libs.versions.namespace.get()
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(name = "proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    buildFeatures {
        compose = true
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.javaVersion.get()))
        vendor.set(JvmVendorSpec.matching(libs.versions.javaVendor.get()))
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.javaVersion.get())
        vendor = JvmVendorSpec.matching(libs.versions.javaVendor.get())
    }
}
