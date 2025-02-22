@file:Suppress("UnstableApiUsage")
android {
    namespace = "${Config.packageName}core_navigation"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose_compiler_version
    }
}

dependencies {
    Dependencies.Kotlin.list.forEach { implementation(it) }
    Dependencies.Compose.list.forEach { implementation(it) }
    implementation(platform(Dependencies.Compose.composeBomVersion))
}