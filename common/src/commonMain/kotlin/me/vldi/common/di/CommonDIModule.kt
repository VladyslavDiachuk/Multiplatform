package me.vldi.common.di

import io.ktor.client.*
import org.koin.dsl.module

val commonDIModule = module {
    single { HttpClient() }
}