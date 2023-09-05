package com.hazem.plugins

import com.hazem.raoutes.getAllHeroes
import com.hazem.raoutes.root
import com.hazem.raoutes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()
        staticResources("/images", "images")
    }
}