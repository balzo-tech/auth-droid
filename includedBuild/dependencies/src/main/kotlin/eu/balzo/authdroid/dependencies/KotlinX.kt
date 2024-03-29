package eu.balzo.authdroid.dependencies

object KotlinX {

    object Coroutines {

        private const val group = "org.jetbrains.kotlinx"
        private const val version = "1.6.0"

        const val core = "$group:kotlinx-coroutines-core:$version"

        const val android = "$group:kotlinx-coroutines-android:$version"

    }

}