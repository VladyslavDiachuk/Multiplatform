plugins {
    kotlin("js")
}

group = "me.vldi"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    val koinVersion = "3.1.2"
    implementation(project(":common"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
    implementation("io.insert-koin:koin-core:$koinVersion")
    implementation("dev.fritz2:core:0.11")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}

afterEvaluate {
    rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
        versions.webpackDevServer.version = "4.0.0"
    }
}