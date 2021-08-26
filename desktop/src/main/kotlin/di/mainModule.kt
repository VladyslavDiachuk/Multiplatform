package di

import org.koin.dsl.module
import users.UsersController

val mainModule = module {
    factory { UsersController(get()) }
}