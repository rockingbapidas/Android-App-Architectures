plugins {
    id(Plugin.android_application)
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_android_extension)
    kotlin(Plugin.kotlin_android_kapt)
}

android {
    compileSdkVersion(Apps.compileSdk)
    flavorDimensions("default")
    buildFeatures.dataBinding = true
    kotlinOptions.jvmTarget = "1.8"

    buildTypes {
        getByName(Debug.name) {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            isShrinkResources = Debug.shrinkResources
            isMinifyEnabled = Debug.minifyEnabled
            isDebuggable = Debug.debuggable
        }
        getByName(Release.name) {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            isShrinkResources = Release.shrinkResources
            isMinifyEnabled = Release.minifyEnabled
            isDebuggable = Release.debuggable
        }
    }

    defaultConfig {
        applicationId = Apps.applicationId
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        renderscriptTargetApi = Apps.renderScriptTarget
        renderscriptSupportModeEnabled = true
        multiDexEnabled = true
        versionName = Apps.versionName
        versionCode = Apps.versionCode
        testInstrumentationRunner = TestDependencies.instrumentationRunner
        setProperty("archivesBaseName", "newsapp-v${versionName}(${versionCode})")
        buildConfigField(
            "int", ConfigField.DATABASE_VERSION, Apps.databaseVersion
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
        buildConfigField(
            "Boolean", ConfigField.LOCAL_CACHE, Apps.localCache
        )
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }

    dexOptions {
        preDexLibraries = false
        javaMaxHeapSize = "4g"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lintOptions {
        isCheckReleaseBuilds = false
    }

    sourceSets {
        getByName("test").resources.setSrcDirs(map { "sampledata" })
        getByName("androidTest").resources.setSrcDirs(map { "sampledata" })
    }
}

kapt {
    javacOptions {
        option("-Xmaxerrs", 500000)
    }
}

dependencies {
    implementation(
        fileTree(
            mapOf(
                "dir" to "src/main/libs",
                "include" to listOf("*.jar", "*.aar")
            )
        )
    )

    kotlin()
    androidx()
    retrofit()
    okHttp()
    rxJava()
    dagger()
    lifeCycle()
    room()
    paging()
    glide()
    uiLibrary()
    jUnit()
    mockito()
    miscellaneousSdks()
}
