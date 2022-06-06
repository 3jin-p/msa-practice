package com.example.secondservice.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/second-service")
class SecondService {

    @GetMapping("/welcome")
    fun welcome():String {
        println("welcome")
        return "welcome to my second service"
    }

    @GetMapping("/check")
    fun check():String {
        println("check")
        return "check"
    }
}