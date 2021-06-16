import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

version = "1.0.0"

val coroutines_version: String by project
val d4j_version: String by project

repositories {
    mavenCentral()
}

dependencies {
    api(project(":discord4j-coroutines-common"))

    api("com.discord4j:discord4j-rest:$d4j_version")

    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}