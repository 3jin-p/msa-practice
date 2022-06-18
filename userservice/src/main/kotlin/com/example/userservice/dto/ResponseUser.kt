package com.example.userservice.dto

import java.lang.IllegalArgumentException

data class ResponseUser(
    val email: String,
    val name: String,
    val userId: String
) {

    companion object {
        fun from(userDto: UserDto) = ResponseUser(userDto.email, userDto.name, userDto.userId?: throw IllegalArgumentException("id not set"))
    }
}