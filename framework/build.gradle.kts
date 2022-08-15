plugins {
    id(Plugin.android_library)
    id(Plugin.proto_buf) version Versions.protobuf_plugin
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_android_extension)
    kotlin(Plugin.kotlin_android_kapt)
}

android {
    compileSdkVersion(AppConfigs.compileSdk)
    kotlinOptions.jvmTarget = "1.8"

    defaultConfig {
        minSdkVersion(AppConfigs.minSdk)
        targetSdkVersion(AppConfigs.targetSdk)
        multiDexEnabled = true
        testInstrumentationRunner = TestDependencies.instrumentationRunner
        consumerProguardFile("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/main/libs", "include" to listOf("*.jar", "*.aar"))))

    implementation(project(":data"))
    implementation(project(":domain"))

    paging()

    retrofit()
    okHttp()
    room()
    dataStore()
    glide()

    kotlin()
    dagger()
    timber()
    jUnit()
    mockito()
    androidxTest()
}