package com.example.firstservice.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first-service")
class FirstServiceRest {

    @GetMapping("/welcome")
    fun welcome():String {
        println("welcome")
        return "welcome to my first service"
    }

    @GetMapping("/check")
    fun check() {
        println("check")
    }
}