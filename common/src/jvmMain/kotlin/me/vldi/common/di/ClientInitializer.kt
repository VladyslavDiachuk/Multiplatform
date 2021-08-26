package me.vldi.common.di

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
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