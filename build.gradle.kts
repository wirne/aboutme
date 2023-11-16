import org.jetbrains.compose.compose
import org.jetbrains.kotlin.konan.target.buildDistribution

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "dev.wirne"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }

            distribution {
                outputDirectory.set(file("$projectDir"))
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(compose.runtime)
            }
        }
    }
}