package com.rodyapal

import com.rodyapal.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
	io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("Unused")
fun Application.module() {
	configureMonitoring()
	configureSerialization()
	configureRouting()
}