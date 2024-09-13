pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin/")
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "spring-boot-kotlin-api-template"

include(":server")
