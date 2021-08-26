package me.vldi.common.di

import io.ktor.client.*
import org.koin.core.module.Module

actual fun Module.singleHTTPClient() {
    single { HttpClient() }
}