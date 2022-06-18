package com.example.userservice.rest

import com.example.userservice.props.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HealthCheckRest(
    val greeting: Greeting
) {

    @GetMapping("/health_check")
    fun healthCheck() = "It's Working in User Service"

    @GetMapping("/welcome")
    fun welcome() = greeting.message
}