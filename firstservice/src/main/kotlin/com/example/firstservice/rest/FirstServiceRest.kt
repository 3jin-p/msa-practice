package com.example.firstservice.rest

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/first-service")
class FirstServiceRest(
    val env: Environment
) {

    @GetMapping("/welcome")
    fun welcome():String {
        println("welcome")
        return "welcome to my first service"
    }

    @GetMapping("/check")
    fun check(request: HttpServletRequest): String {
        println("Server port = ${request.serverPort}")
        return "Hi, there. This is a message from First Service on PORT ${env.getProperty("server.port")}"
    }
}