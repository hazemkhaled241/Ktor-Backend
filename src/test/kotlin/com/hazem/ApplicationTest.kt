package com.hazem

import com.hazem.models.ApiResponse
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class ApplicationTest {


    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        val response = client.get("/")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Welcome to Boruto Api!", response.bodyAsText())
    }

    @Test
    fun `access all heroes endpoint,query page number, assert correct information`() = testApplication {

        val response = client.get("/boruto/heroes?page=1")
        assertEquals(HttpStatusCode.OK, response.status)
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
        val expected = ApiResponse(
            success = true,
            message = "OK",
            prevPage = null,
            nextPage = 2,
            heroes = heroes[0],
            lastUpdated =actual.lastUpdated
        )
        assertEquals(expected.toString(), actual.toString())
    }

    @Test
    fun `search for hero endpoint,query hero name, assert correct information`() = testApplication{
        val response = client.get("/boruto/heroes/search?name=s")
        assertEquals(HttpStatusCode.OK, response.status)
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
        val expected = ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes("s")
        )
        assertEquals(expected.toString(), actual.toString())

    }

}