plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.ecommerceapp"
    compileSdk = 34

    buildFeatures{
        viewBinding = true

    }

    defaultConfig {
        applicationId = "com.example.ecommerceapp"
        minSdk = 23
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // rounded imageview at item_categories
    implementation("com.makeramen:roundedimageview:2.3.0")

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.lifecycle:lifecycle-common:2.6.1")

    // For Searchbar
    implementation("com.github.mancj:MaterialSearchBar:0.8.5")

    // Material Components for Android. Replace the version with the latest version of Material Components library.
    implementation("com.google.android.material:material:1.5.0")

    // Circle Indicator (To fix the xml preview "Missing classes" error)
    implementation("me.relex:circleindicator:2.1.6")

    implementation("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0")

    implementation("com.android.volley:volley:1.2.1")

    implementation("com.github.hishd:TinyCart:1.0.1")

    implementation("com.github.delight-im:Android-AdvancedWebView:v3.2.1")

}