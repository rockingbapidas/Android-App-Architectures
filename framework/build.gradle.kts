plugins {
    id(Plugin.android_library)
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_android_extension)
    kotlin(Plugin.kotlin_android_kapt)
}

android {
    compileSdkVersion(Apps.compileSdk)
    kotlinOptions.jvmTarget = "1.8"

    defaultConfig {
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        versionName = Apps.versionName
        versionCode = Apps.versionCode
        multiDexEnabled = true
        testInstrumentationRunner = TestDependencies.instrumentationRunner
        consumerProguardFile("consumer-rules.pro")
        buildConfigField(
            "int", ConfigField.DATABASE_VERSION, Apps.databaseVersion
        )
        buildConfigField(
            "String", ConfigField.DATABASE_NAME, "\"${Apps.databaseName}\""
        )
        buildConfigField(
            "String", ConfigField.DOMAIN, "\"${Apps.domain}\""
        )
        buildConfigField(
            "String", ConfigField.API_DOMAIN, "\"${Apps.apiDomain}\""
        )
        buildConfigField(
            "String", ConfigField.API_KEY, "\"${Apps.apiKey}\""
        )
    }

    buildTypes {
        getByName(Release.name) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
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
    glide()

    kotlin()
    dagger()
    timber()
    jUnit()
    mockito()
    androidxTest()
}