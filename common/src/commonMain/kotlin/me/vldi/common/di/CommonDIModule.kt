package me.vldi.common.di

import me.vldi.common.api.UsersApi
import org.koin.dsl.module

val commonDIModule = module {
    singleHTTPClient()
    single { UsersApi(get()) }
}