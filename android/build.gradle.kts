plugins {
    id("com.android.library")
}

group = "com.example.whisper_flutter"
version = "1.0"

android {
    namespace = "com.example.whisper_flutter"
    compileSdk = 34
    ndkVersion = "27.0.11902837"

    defaultConfig {
        minSdk = 21
        ndk {
            // Flutter does not currently support building for x86 Android (See Issue 9253).
            abiFilters("armeabi-v7a", "x86_64", "arm64-v8a")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    externalNativeBuild {
        cmake {
            path = file("../src/CMakeLists.txt")
            version = "3.22.1"
        }
    }
}
