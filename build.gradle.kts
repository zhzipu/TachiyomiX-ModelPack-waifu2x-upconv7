plugins {
    id("com.android.application") version "9.2.1"
}

android {
    namespace = "com.tachiyomix.modelpack.waifu2xupconv7"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.tachiyomix.modelpack.waifu2xupconv7"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
        manifestPlaceholders["modelpackId"] = "waifu2x-upconv7"
        manifestPlaceholders["modelpackName"] = "waifu2x Upconv7 模型"
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}
