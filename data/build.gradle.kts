plugins {
    id(Plugin.java_library)
    id(Plugin.kotlin)
    kotlin(Plugin.kotlin_android_kapt)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/main/libs", "include" to listOf("*.jar", "*.aar"))))
    implementation(project(":domain"))
    kotlin()
    dagger()
}

