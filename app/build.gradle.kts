plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.f1flighthunter.app"
    compileSdk = 35
    defaultConfig { applicationId = "com.f1flighthunter.app"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0" }
}

dependencies {
    implementation("androidx.activity:activity-ktx:1.10.0")
    implementation("androidx.core:core-ktx:1.15.0")
}
