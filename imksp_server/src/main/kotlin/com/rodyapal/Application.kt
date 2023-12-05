package com.rodyapal

import com.rodyapal.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
	io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
	configureMonitoring()
	configureSerialization()
	configureDatabases()
	configureRouting()
}
