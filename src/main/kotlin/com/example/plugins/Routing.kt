package com.example.plugins

import com.example.jony.Text
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!", contentType = ContentType.Text.Plain)
        }
        get("/test") {
            call.respondText(Text().textTest())
        }
        post("/") {
            call.respondText("Hello Post World!", contentType = ContentType.Text.Plain)
        }
    }

}
