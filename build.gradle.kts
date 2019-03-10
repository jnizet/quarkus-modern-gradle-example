plugins {
    java
    id("io.quarkus.gradle.plugin") version "0.11.0"
}

repositories {
    mavenCentral()
    maven(url = uri("http://repository.jboss.org/nexus/content/groups/public"))
}

dependencies {
    compileOnly("io.quarkus:quarkus-resteasy:0.11.0")
    compileOnly("io.quarkus:quarkus-arc:0.11.0")
}
