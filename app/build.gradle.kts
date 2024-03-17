plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "codeflies.com.saalimmvvm"
    compileSdk = 34

    defaultConfig {
        applicationId = "codeflies.com.saalimmvvm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        enable = true
    }
    dataBinding {
        enable = true
    }
}

dependencies {
    val nav_version = "2.7.7"
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")



    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")


    //Jackson convertor
    implementation("com.squareup.retrofit2:converter-jackson:2.9.0")
    //RXBinding
    implementation("com.jakewharton.rxrelay3:rxrelay:3.0.0") // RxRelay dependency
    implementation("io.reactivex.rxjava3:rxjava:3.0.13") // RxJava dependency
    implementation("com.jakewharton.rxbinding4:rxbinding:4.0.0") // RxBinding dependency
    implementation("com.jakewharton.rxbinding4:rxbinding:4.0.0")


    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation("com.github.bumptech.glide:glide:4.12.0")
    kapt("com.github.bumptech.glide:compiler:4.12.0")


    // Material Components dependency
    implementation ("com.google.android.material:material:1.5.0")
    implementation("com.google.android.material:material:1.11.0")
    // Other dependencies...
    implementation ("com.google.android.material:material:1.5.0")


}
