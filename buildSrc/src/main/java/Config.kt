object BuildConfigFields {
    const val ENCRYPTION_SECRET_KEY = "ENCRYPTION_SECRET_KEY"
    const val DATABASE_PROTECTION_KEY = "DATABASE_PROTECTION_KEY"
    const val DATABASE_VERSION = "DATABASE_VERSION"
    const val DATABASE_NAME = "DATABASE_NAME"
    const val DATASTORE_VERSION = "DATASTORE_VERSION"
    const val DATASTORE_NAME = "DATASTORE_NAME"
    const val DOMAIN = "DOMAIN"
    const val API_DOMAIN = "API_DOMAIN"
    const val PUBLIC_KEY = "PUBLIC_KEY"
    const val GOOGLE_MAPS_KEY = "GOOGLE_MAPS_KEY"
    const val ENABLE_CRASH_REPORTING = "ENABLE_CRASH_REPORTING"
    const val ENABLE_PERFORMANCE_LOG = "ENABLE_PERFORMANCE_LOG"
    const val ENABLE_LOGS = "ENABLE_LOGS"
    const val FILE_PROVIDER = "FILE_PROVIDER"
    const val WORKER_PROVIDER = "WORKER_PROVIDER"
    const val HEADLINES_LOCAL_CACHE = "HEADLINES_LOCAL_CACHE"
    const val NEWS_DATA_API_KEY = "NEWS_DATA_API_KEY"
}

object ResourceFields {
    const val application_id = "application_id"
    const val facebook_app_id = "facebook_app_id"
    const val fb_login_protocol_scheme = "fb_login_protocol_scheme"
    const val enable_crash_reporting = "enable_crash_reporting"
    const val enable_performance_log = "enable_performance_log"
    const val file_provider = "file_provider"
    const val worker_provider = "worker_provider"
    const val google_maps_key = "google_maps_key"
}

object ManifestPlaceHolders {
    const val application_id = "applicationId"
    const val facebook_app_id = "facebookAppId"
    const val fb_login_protocol_scheme = "fbLoginProtocolScheme"
    const val enable_crash_reporting = "enableCrashReporting"
    const val enable_performance_log = "enablePerformanceLog"
    const val file_provider = "fileProvider"
    const val worker_provider = "workerProvider"
    const val google_maps_key = "googleMapsKey"
}

object AppConfigs {
    const val applicationId = "com.bapidas.news"
    const val compileSdk = 31
    const val minSdk = 23
    const val targetSdk = 31
    const val renderScriptTarget = 18
    const val databaseVersion = "1"
    const val databaseName = "news-db"
    const val dataStoreVersion = "1"
    const val dataStoreName = "news-store"
    const val versionName = "1.0.0"
    const val versionCode = 1
    const val fileProvider = "${applicationId}.file.provider"
    const val workerProvider = "${applicationId}.workmanager-init"
    const val localCache = "true"
}

object SecretKey {
    const val encryptionSecretKey = "fqJfdzGDvfwbedsKSUGty3VZ9taXxMVw"
    const val databaseSecretKey = "NewsAppDatabaseSecurity@123!@#\$tyu7890123q"
}

object SigningConfigs {
    object Debug {
        const val name = "config_debug"
        const val keyAlias = "newsApp"
        const val keyPassword = "123456789"
        const val storePassword = "123456789"
        const val storeFile = "newsApp_debug_key"
    }

    object Release {
        const val name = "config_release"
        const val keyAlias = "newsApp"
        const val keyPassword = "2Nje6UJP%NnqF2Dq"
        const val storePassword = "2Nje6UJP%NnqF2Dq"
        const val storeFile = "newsApp_release_key"
    }
}

object BuildVariants {
    object Dev {
        const val name = "debug"
        const val debuggable = true
        const val shrinkResources = false
        const val minifyEnabled = false

        const val publicKey = ""
        const val domain = "newsapi.org"
        const val apiDomain = "http://$domain"
        const val apiKey = "59b23dbaede34a2488fe2d4da93b9ffb"

        const val enableCrashReport = "false"
        const val enablePerformanceReport = "false"
        const val enableLogs = "true"
        const val googleMapsKey = ""
        const val facebookAppId = ""
        const val fbLoginProtocolScheme = ""

        val manifestPlaceholders = mapOf<String, Any>(
            ManifestPlaceHolders.enable_crash_reporting to enableCrashReport,
            ManifestPlaceHolders.enable_performance_log to enablePerformanceReport,
            ManifestPlaceHolders.google_maps_key to googleMapsKey,
            ManifestPlaceHolders.facebook_app_id to facebookAppId,
            ManifestPlaceHolders.fb_login_protocol_scheme to fbLoginProtocolScheme
        )
    }

    object Prod {
        const val name = "release"
        const val debuggable = false
        const val shrinkResources = true
        const val minifyEnabled = true

        const val publicKey = ""
        const val domain = "newsapi.org"
        const val apiDomain = "http://$domain"
        const val apiKey = "59b23dbaede34a2488fe2d4da93b9ffb"

        const val enableCrashReport = "true"
        const val enablePerformanceReport = "true"
        const val enableLogs = "false"
        const val googleMapsKey = ""
        const val facebookAppId = ""
        const val fbLoginProtocolScheme = ""

        val manifestPlaceholders = mapOf<String, Any>(
            ManifestPlaceHolders.enable_crash_reporting to enableCrashReport,
            ManifestPlaceHolders.enable_performance_log to enablePerformanceReport,
            ManifestPlaceHolders.google_maps_key to googleMapsKey,
            ManifestPlaceHolders.facebook_app_id to facebookAppId,
            ManifestPlaceHolders.fb_login_protocol_scheme to fbLoginProtocolScheme
        )
    }
}