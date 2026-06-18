dependencies {
    api(projects.bedrockCodec)
    api(libs.adventure.text.serializer.legacy)
    api(libs.adventure.text.serializer.json)

    // Tests
    testImplementation(libs.junit)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "org.cloudburstmc.protocol.adventure")
    }
}
