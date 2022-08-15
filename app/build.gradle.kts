plugins {
    id(Plugin.android_application)
    kotlin(Plugin.kotlin_android)
    kotlin(Plugin.kotlin_android_extension)
    kotlin(Plugin.kotlin_android_kapt)
}

android {
    compileSdkVersion(AppConfigs.compileSdk)
    flavorDimensions("app")
    buildFeatures.dataBinding = true
    kotlinOptions.jvmTarget = "1.8"
    bundle.language.enableSplit = false

    defaultConfig {
        applicationId = AppConfigs.applicationId
        minSdkVersion(AppConfigs.minSdk)
        targetSdkVersion(AppConfigs.targetSdk)
        renderscriptTargetApi = AppConfigs.renderScriptTarget
        renderscriptSupportModeEnabled = true
        multiDexEnabled = true
        versionName = AppConfigs.versionName
        versionCode = AppConfigs.versionCode
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = TestDependencies.instrumentationRunner
        setProperty("archivesBaseName", "newsApp-v${versionName}(${versionCode})")
        setManifestPlaceholders(
            mapOf(
                ManifestPlaceHolders.worker_provider to AppConfigs.workerProvider,
                ManifestPlaceHolders.file_provider to AppConfigs.fileProvider
            )
        )

        resValue(
            "string", ResourceFields.application_id, applicationId.toString()
        )
        resValue(
            "string", ResourceFields.file_provider, AppConfigs.fileProvider
        )
        resValue(
            "string", ResourceFields.worker_provider, AppConfigs.workerProvider
        )

        buildConfigField(
            "String",
            BuildConfigFields.ENCRYPTION_SECRET_KEY,
            "\"${SecretKey.encryptionSecretKey}\""
        )
        buildConfigField(
            "String",
            BuildConfigFields.DATABASE_PROTECTION_KEY,
            "\"${SecretKey.databaseSecretKey}\""
        )
        buildConfigField(
            "int", BuildConfigFields.DATABASE_VERSION, AppConfigs.databaseVersion
        )
        buildConfigField(
            "String", BuildConfigFields.DATABASE_NAME, "\"${AppConfigs.databaseName}\""
        )
        buildConfigField(
            "int", BuildConfigFields.DATASTORE_VERSION, AppConfigs.dataStoreVersion
        )
        buildConfigField(
            "String", BuildConfigFields.DATASTORE_NAME, "\"${AppConfigs.dataStoreName}\""
        )
        buildConfigField(
            "String", BuildConfigFields.FILE_PROVIDER, "\"${AppConfigs.fileProvider}\""
        )
        buildConfigField(
            "String", BuildConfigFields.WORKER_PROVIDER, "\"${AppConfigs.workerProvider}\""
        )
        buildConfigField(
            "Boolean", BuildConfigFields.HEADLINES_LOCAL_CACHE, AppConfigs.localCache
        )
    }

    signingConfigs {
        create(SigningConfigs.Debug.name) {
            keyAlias = SigningConfigs.Debug.keyAlias
            keyPassword = SigningConfigs.Debug.keyPassword
            storePassword = SigningConfigs.Debug.storePassword
            storeFile = file(SigningConfigs.Debug.storeFile)
        }

        create(SigningConfigs.Release.name) {
            keyAlias = SigningConfigs.Release.keyAlias
            keyPassword = SigningConfigs.Release.keyPassword
            storePassword = SigningConfigs.Release.storePassword
            storeFile = file(SigningConfigs.Release.storeFile)
        }
    }

    buildTypes {
        getByName(BuildVariants.Dev.name) {
            signingConfig = signingConfigs[SigningConfigs.Debug.name]
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            isShrinkResources = BuildVariants.Dev.shrinkResources
            isMinifyEnabled = BuildVariants.Dev.minifyEnabled
            isDebuggable = BuildVariants.Dev.debuggable
        }

        getByName(BuildVariants.Prod.name) {
            signingConfig = signingConfigs[SigningConfigs.Release.name]
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            isShrinkResources = BuildVariants.Prod.shrinkResources
            isMinifyEnabled = BuildVariants.Prod.minifyEnabled
            isDebuggable = BuildVariants.Prod.debuggable
        }
    }

    applicationVariants.all {
        if (name == BuildVariants.Dev.name) {
            BuildVariants.Dev.manifestPlaceholders.forEach { (s, any) ->
                mergedFlavor.manifestPlaceholders[s] = any
            }
            buildConfigField(
                "String",
                BuildConfigFields.GOOGLE_MAPS_KEY,
                "\"${BuildVariants.Dev.googleMapsKey}\""
            )
            buildConfigField(
                "String", BuildConfigFields.DOMAIN, "\"${BuildVariants.Dev.domain}\""
            )
            buildConfigField(
                "String", BuildConfigFields.API_DOMAIN, "\"${BuildVariants.Dev.apiDomain}\""
            )
            buildConfigField(
                "String", BuildConfigFields.PUBLIC_KEY, "\"${BuildVariants.Dev.publicKey}\""
            )
            buildConfigField(
                "Boolean",
                BuildConfigFields.ENABLE_CRASH_REPORTING,
                BuildVariants.Dev.enableCrashReport
            )
            buildConfigField(
                "Boolean",
                BuildConfigFields.ENABLE_PERFORMANCE_LOG,
                BuildVariants.Dev.enablePerformanceReport
            )
            buildConfigField(
                "Boolean", BuildConfigFields.ENABLE_LOGS, BuildVariants.Dev.enableLogs
            )
            buildConfigField(
                "String", BuildConfigFields.NEWS_DATA_API_KEY, "\"${BuildVariants.Dev.apiKey}\""
            )

            resValue(
                "string", ResourceFields.facebook_app_id, BuildVariants.Dev.facebookAppId
            )
            resValue(
                "string",
                ResourceFields.fb_login_protocol_scheme,
                BuildVariants.Dev.fbLoginProtocolScheme
            )
            resValue(
                "bool", ResourceFields.enable_crash_reporting, BuildVariants.Dev.enableCrashReport
            )
            resValue(
                "bool",
                ResourceFields.enable_performance_log,
                BuildVariants.Dev.enablePerformanceReport
            )
        }

        if (name == BuildVariants.Prod.name) {
            BuildVariants.Prod.manifestPlaceholders.forEach { (s, any) ->
                mergedFlavor.manifestPlaceholders[s] = any
            }
            buildConfigField(
                "String",
                BuildConfigFields.GOOGLE_MAPS_KEY,
                "\"${BuildVariants.Prod.googleMapsKey}\""
            )
            buildConfigField(
                "String", BuildConfigFields.DOMAIN, "\"${BuildVariants.Prod.domain}\""
            )
            buildConfigField(
                "String", BuildConfigFields.API_DOMAIN, "\"${BuildVariants.Prod.apiDomain}\""
            )
            buildConfigField(
                "String", BuildConfigFields.PUBLIC_KEY, "\"${BuildVariants.Prod.publicKey}\""
            )
            buildConfigField(
                "Boolean",
                BuildConfigFields.ENABLE_CRASH_REPORTING,
                BuildVariants.Prod.enableCrashReport
            )
            buildConfigField(
                "Boolean",
                BuildConfigFields.ENABLE_PERFORMANCE_LOG,
                BuildVariants.Prod.enablePerformanceReport
            )
            buildConfigField(
                "Boolean", BuildConfigFields.ENABLE_LOGS, BuildVariants.Prod.enableLogs
            )
            buildConfigField(
                "String", BuildConfigFields.NEWS_DATA_API_KEY, "\"${BuildVariants.Prod.apiKey}\""
            )

            resValue(
                "string", ResourceFields.facebook_app_id, BuildVariants.Prod.facebookAppId
            )
            resValue(
                "string",
                ResourceFields.fb_login_protocol_scheme,
                BuildVariants.Prod.fbLoginProtocolScheme
            )
            resValue(
                "bool", ResourceFields.enable_crash_reporting, BuildVariants.Prod.enableCrashReport
            )
            resValue(
                "bool",
                ResourceFields.enable_performance_log,
                BuildVariants.Prod.enablePerformanceReport
            )
        }
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

    packagingOptions {
        exclude("builddef.lst")
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
    }
}

androidExtensions {
    isExperimental = true
}

kapt {
    javacOptions {
        option("-Xmaxerrs", 500000)
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/main/libs", "include" to listOf("*.jar", "*.aar"))))

    injectCommons()

    androidx()
    paging()
    workManager()
    lifeCycle()

    kotlin()
    dagger()
    timber()
    jUnit()
    mockito()
    androidxTest()

    featureHeadlines()
}
