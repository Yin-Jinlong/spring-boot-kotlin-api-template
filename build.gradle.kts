plugins {
    id("java")
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.spring) apply false
    alias(libs.plugins.spring.boot) apply false
    alias(libs.plugins.spring.dependency.management) apply false
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/central")
        mavenCentral()
    }
}

