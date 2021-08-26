package me.vldi.common.di

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.core.module.Module

actual fun Module.singleHTTPClient() {
    single {
        HttpClient(CIO) {
            install(JsonFeature) {
                serializer = GsonSerializer()
            }
        }
    }
}

actual val iODispatcher = Dispatchers.Main as CoroutineDispatcher
