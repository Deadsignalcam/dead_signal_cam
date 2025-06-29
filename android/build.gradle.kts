plugins {
id("com.android.application")
kotlin("android")
id("com.google.gms.google-services") // Firebase plugin
}

android {
compileSdk = 33

defaultConfig {
applicationId = "com.yourcompany.deadsignalcam" // ✅ Use your real package name
minSdk = 21
targetSdk = 33
versionCode = 1
versionName = "1.0"
}

buildTypes {
release {
isMinifyEnabled = false
proguardFiles(
getDefaultProguardFile("proguard-android-optimize.txt"),
"proguard-rules.pro"
)
}
}
}

dependencies {
implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
implementation("com.google.firebase:firebase-analytics-ktx:21.2.0")
// Add other Firebase or app dependencies here
}