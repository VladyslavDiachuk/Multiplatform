package me.vldi.common.di

import me.vldi.common.api.UsersApi
import me.vldi.common.users.UsersController
import org.koin.dsl.module

val commonDIModule = module {
    singleHTTPClient()
    single { UsersApi(get()) }
    factory { UsersController(get()) }
}