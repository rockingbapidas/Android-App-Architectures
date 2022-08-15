object Versions {
    const val gradle = "4.1.2"
    const val kotlin = "1.5.21"
    const val appcompat = "1.3.0"
    const val core_ktx = "1.5.0"
    const val material_component = "1.3.0"
    const val multi_dex = "2.0.1"
    const val constraint_layout = "1.1.3"
    const val retrofit = "2.7.1"
    const val ok_http = "4.4.0"
    const val gson = "2.8.6"
    const val dagger = "2.36"
    const val lifecycle = "2.2.0"
    const val room = "2.2.4"
    const val datastore = "1.0.0-rc01"
    const val protobuf = "3.10.0"
    const val protobuf_plugin = "0.8.17"
    const val paging = "2.1.1"
    const val work = "2.3.2"
    const val glide = "4.11.0"
    const val timber = "4.7.1"
    const val shimmer = "0.5.0"

    /* test */
    const val junit = "4.12"
    const val ext_junit = "1.1.1"
    const val test = "1.2.0"
    const val espresso = "3.2.0"
    const val mockito = "3.2.4"
    const val arch = "2.1.0"
}

object Plugin {
    const val android_application = "com.android.application"
    const val android_library = "com.android.library"
    const val java_library = "java-library"
    const val kotlin_android = "android"
    const val kotlin = "kotlin"
    const val kotlin_android_extension = "android.extensions"
    const val kotlin_android_kapt = "kapt"
    const val proto_buf = "com.google.protobuf"
}

object Libs {
    const val gradle_lib = "com.android.tools.build:gradle:${Versions.gradle}"
    const val gradle_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Dependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val app_compat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val multi_dex = "androidx.multidex:multidex:${Versions.multi_dex}"
    const val material_component =
        "com.google.android.material:material:${Versions.material_component}"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val view_model = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val live_data = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"

    const val datastore = "androidx.datastore:datastore:${Versions.datastore}"
    const val datastore_preferences =
        "androidx.datastore:datastore-preferences:${Versions.datastore}"
    const val protobuf_javalite = "com.google.protobuf:protobuf-javalite:${Versions.protobuf}"

    const val paging_runtime = "androidx.paging:paging-runtime-ktx:${Versions.paging}"

    const val work_runtime = "androidx.work:work-runtime-ktx:${Versions.work}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glide_integration = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val ok_http = "com.squareup.okhttp3:okhttp:${Versions.ok_http}"
    const val ok_http_url_connection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.ok_http}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.ok_http}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"
}

object TestDependencies {
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val junit = "junit:junit:${Versions.junit}"
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"

    const val arch_core_testing = "androidx.arch.core:core-testing:${Versions.arch}"
    const val test_rules = "androidx.test:rules:${Versions.test}"
    const val test_runner = "androidx.test:runner:${Versions.test}"
    const val test_ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val test_espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_android = "org.mockito:mockito-android:${Versions.mockito}"
    const val mockito_inline = "org.mockito:mockito-inline:${Versions.mockito}"
}

object RepoUrl {
    const val gradle = "https://plugins.gradle.org/m2/"
    const val jit_pack = "https://jitpack.io"
}