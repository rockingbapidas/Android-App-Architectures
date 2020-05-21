import org.gradle.api.artifacts.dsl.DependencyHandler

//Dependency Handler method
private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}

private fun DependencyHandler.testImplementation(depName: String) {
    add("testImplementation", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}

//Dependency Handler extension
fun DependencyHandler.dagger() {
    implementation(Dependencies.dagger_android)
    kapt(Dependencies.dagger_compiler)
    kapt(Dependencies.dagger_processor)
}

fun DependencyHandler.rxJava() {
    implementation(Dependencies.rxjava)
    implementation(Dependencies.rxandroid)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofit_rxjava)
    implementation(Dependencies.retrofit_gson)
}

fun DependencyHandler.okHttp() {
    implementation(Dependencies.logging_interceptor)
    implementation(Dependencies.okhttp_urlconnection)
}

fun DependencyHandler.room() {
    implementation(Dependencies.room_runtime)
    kapt(Dependencies.room_compiler)
    implementation(Dependencies.room_rxjava2)
}

fun DependencyHandler.paging() {
    implementation(Dependencies.paging_runtime)
    implementation(Dependencies.paging_rxjava2)
}

fun DependencyHandler.lifeCycle() {
    implementation(Dependencies.extensions)
    implementation(Dependencies.reactive_streams)
    implementation(Dependencies.view_model)
}

fun DependencyHandler.glide() {
    implementation(Dependencies.glide)
    kapt(Dependencies.glide_compiler)
    implementation(Dependencies.glide_integration)
}

fun DependencyHandler.kotlin() {
    implementation(Dependencies.kotlin_stdlib)
    implementation(Dependencies.kotlin_reflect)
    //Test Libraries
    testImplementation(TestDependencies.kotlin_test)
}

fun DependencyHandler.androidx() {
    implementation(Dependencies.material_component)
    implementation(Dependencies.core_ktx)
    implementation(Dependencies.app_compat)
    implementation(Dependencies.multidex)
    implementation(Dependencies.constraintlayout)
    //Test Libraries
    androidTestImplementation(TestDependencies.test_runner)
    androidTestImplementation(TestDependencies.test_ext_junit)
    androidTestImplementation(TestDependencies.test_espresso_core)
    testImplementation(TestDependencies.arch_core_testing)
}

fun DependencyHandler.jUnit() {
    testImplementation(TestDependencies.junit)
}

fun DependencyHandler.mockito() {
    testImplementation(TestDependencies.mockito_kotlin)
    testImplementation(TestDependencies.mockito_inline)
}

fun DependencyHandler.uiLibrary() {
    implementation(Dependencies.shimmer)
}

fun DependencyHandler.miscellaneousSdks() {
    implementation(Dependencies.gson)
    implementation(Dependencies.timber)
}