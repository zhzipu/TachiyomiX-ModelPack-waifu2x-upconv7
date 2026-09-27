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
        versionCode = 6
        versionName = "1.3"
        manifestPlaceholders["modelpackId"] = "waifu2x-upconv7"
        manifestPlaceholders["modelpackName"] = "waifu2x Upconv7 模型"
    }

    buildTypes {
        named("release") {
            // 侧载安装，与原 model-packs 模块一致使用 debug 签名
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

    // 自带 libmodelpack.so 的模型包必须解压原生库到 nativeLibraryDir，
    // 宿主才能用系统认可的路径 dlopen；否则 .so 留在 APK 内会被拒绝加载
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

androidComponents {
    onVariants { variant ->
        variant.outputs.forEach { output ->
            output.outputFileName.set("TachiyomiX-modelpack-waifu2x-upconv7-release.apk")
        }
    }
}
