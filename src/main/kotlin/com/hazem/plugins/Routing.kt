package com.hazem.plugins

import com.hazem.raoutes.getAllHeroes
import com.hazem.raoutes.root
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        staticResources("/images", "images")
    }
}