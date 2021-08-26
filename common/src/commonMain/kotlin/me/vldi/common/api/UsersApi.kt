package me.vldi.common.api

import io.ktor.client.*
import io.ktor.client.request.*
import me.vldi.common.USERS
import me.vldi.common.entities.User

class UsersApi(private val client: HttpClient) {
    suspend fun getUsers(): List<User> {
        return client.get(USERS)
    }
}