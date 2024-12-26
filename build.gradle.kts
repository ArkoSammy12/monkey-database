plugins {
    kotlin("jvm") version "2.1.0"
    id("maven-publish")
    java
}

group = property("maven_group")!!
version = property("project_version")!!
val archiveBaseName: String = property("archives_base_name") as String

base {
    archivesName = archiveBaseName
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.xerial:sqlite-jdbc:${property("sqlite-jdbc_version")}")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}