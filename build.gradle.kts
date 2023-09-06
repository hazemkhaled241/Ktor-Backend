plugins {
    kotlin("jvm") version "1.9.0"
    id("io.ktor.plugin") version "2.3.4"}

group = "com.hazem"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("com.hazem.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-call-logging-jvm:2.3.4")
    implementation("io.ktor:ktor-server-default-headers-jvm:2.3.4")
    implementation("io.ktor:ktor-server-core-jvm:2.3.4")
    implementation("io.ktor:ktor-server-host-common-jvm:2.3.4")
    implementation("io.ktor:ktor-server-status-pages-jvm:2.3.4")
    implementation("io.ktor:ktor-server-core:2.3.4")
    implementation("io.ktor:ktor-server-netty:2.3.4")
    implementation("io.ktor:ktor-serialization:2.3.4")
    implementation("ch.qos.logback:logback-classic:1.4.11")
    implementation("io.insert-koin:koin-ktor:3.4.3")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.4")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.4")
    implementation("io.insert-koin:koin-logger-slf4j:3.4.3")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.0")
}



