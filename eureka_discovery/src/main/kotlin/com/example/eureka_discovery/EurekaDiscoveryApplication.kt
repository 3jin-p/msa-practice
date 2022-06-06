package com.example.eureka_discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaDiscoveryApplication

fun main(args: Array<String>) {
    println("")
    runApplication<EurekaDiscoveryApplication>(*args)
}
