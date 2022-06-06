package com.example.firstservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class FirstserviceApplication

fun main(args: Array<String>) {
    runApplication<FirstserviceApplication>(*args)
}
