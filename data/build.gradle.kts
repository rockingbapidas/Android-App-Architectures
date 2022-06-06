plugins {
    id(Plugin.java_library)
    id(Plugin.kotlin)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/main/libs", "include" to listOf("*.jar", "*.aar"))))
    implementation(project(":domain"))
    kotlin()
}

