object Apps {
    const val applicationId = "com.bapidas.news"
    const val compileSdk = 29
    const val minSdk = 23
    const val targetSdk = 29
    const val renderScriptTarget = 18
    const val databaseVersion = "1"
    const val versionName = "1.0.0"
    const val versionCode = 1
    const val domain = "newsapi.org"
    const val apiDomain = "http://newsapi.org"
    const val apiKey = "59b23dbaede34a2488fe2d4da93b9ffb"
}

object Debug {
    const val name = "debug"
    const val debuggable = true
    const val versionNameSuffix = "-debug"
    const val shrinkResources = false
    const val minifyEnabled = false
}

object Release {
    const val name = "release"
    const val debuggable = true
    const val versionNameSuffix = "-release"
    const val shrinkResources = true
    const val minifyEnabled = true
}

object ConfigField {
    const val DATABASE_VERSION = "DATABASE_VERSION"
    const val DOMAIN = "DOMAIN"
    const val API_DOMAIN = "API_DOMAIN"
    const val API_KEY = "API_KEY"
}