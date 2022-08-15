plugins {
    id(Plugin.android_library)
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_android_extension)
    kotlin(Plugin.kotlin_android_kapt)
}

android {
    compileSdkVersion(AppConfigs.compileSdk)
    buildFeatures.dataBinding = true
    buildFeatures.viewBinding = true
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

    sourceSets {
        getByName("test").resources.setSrcDirs(map { "sampledata" })
        getByName("androidTest").resources.setSrcDirs(map { "sampledata" })
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/main/libs", "include" to listOf("*.jar", "*.aar"))))

    injectCommons()

    androidx()
    paging()
    workManager()
    lifeCycle()
    shimmer()

    kotlin()
    dagger()
    timber()
    jUnit()
    mockito()
    androidxTest()
}