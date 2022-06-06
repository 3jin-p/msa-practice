package com.example.secondservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class SecondserviceApplication

fun main(args: Array<String>) {
    runApplication<SecondserviceApplication>(*args)
}
