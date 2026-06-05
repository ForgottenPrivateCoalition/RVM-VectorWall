plugins {
    java
    id("com.gradleup.shadow") version "8.3.5"
}

group = "rvm.vector.wall"
version = "1.0.0"

repositories {
    mavenCentral()
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.5.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.5.0-SNAPSHOT")
    implementation("org.hsqldb:hsqldb:2.7.4")  // HSQLDB вместо H2
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks.shadowJar {
    // relocate("org.h2", "rvm.vector.wall.libs.h2")

    archiveBaseName.set("rvm-vectorwall")
    archiveVersion.set("1.0.1.5")
    archiveClassifier.set("") // убирает "-all" суффикс
}

tasks.build {
    dependsOn(tasks.shadowJar)
}