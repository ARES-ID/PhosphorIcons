// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.comAndroidApplication) apply false
    alias(libs.plugins.comAndroidLibrary) apply false
    alias(libs.plugins.orgJetbrainsKotlinAndroid) apply false
    alias(libs.plugins.ioGitlabArturboschDetekt) apply false
    alias(libs.plugins.orgJmailenKotlinter) apply false
}
