import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}
apply(plugin = "maven-publish")

version = "1.2.0"

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

configure<PublishingExtension> {
    repositories {
        maven(url = "${rootProject.buildDir}/repo")
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

configure<PublishingExtension> {
    repositories {
        maven(url = "${rootProject.buildDir}/repo")
    }

    publications {
        register("maven", MavenPublication::class) {
            from(components["kotlin"])
            artifact(sourcesJar)
        }
    }
}