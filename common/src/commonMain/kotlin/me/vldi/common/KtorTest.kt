package me.vldi.common

import io.ktor.client.*
import io.ktor.client.request.*


class KtorTest {
    val client = HttpClient()

    suspend fun getUser1(): String {
        return client.get("https://jsonplaceholder.typicode.com/users/1")
    }
}