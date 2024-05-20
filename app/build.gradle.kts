plugins {
    alias(libs.plugins.comAndroidApplication)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.ioGitlabArturboschDetekt)
}

android {
    namespace = libs.versions.namespace.get() + ".app"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.namespace.get()
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = libs.versions.versionCodeOffset.get().toInt()
        versionName = libs.versions.version.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidxCore.coreKtx)
    implementation(libs.androidxAppcompat.appcompat)
    implementation(libs.comGoogleAndroidMaterial.material)
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.androidxTestExt.junit)
    androidTestImplementation(libs.androidxTestEspresso.espressoCore)
}
