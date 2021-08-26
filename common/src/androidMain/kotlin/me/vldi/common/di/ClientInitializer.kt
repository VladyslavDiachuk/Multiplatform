package me.vldi.common.di

import io.ktor.client.*
import kotlinx.coroutines.Dispatchers
import org.koin.core.module.Module

actual fun Module.singleHTTPClient() {
    single { HttpClient() }
}

actual val iODispatcher = Dispatchers.IO