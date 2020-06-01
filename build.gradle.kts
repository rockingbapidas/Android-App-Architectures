// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri(RepoUrl.gradle) }
    }
    dependencies {
        classpath(Libs.gradle_lib)
        classpath(Libs.gradle_kotlin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri(RepoUrl.jit_pack) }
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
