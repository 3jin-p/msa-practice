package com.example.userservice.dto

import com.fasterxml.jackson.annotation.JsonInclude
import java.lang.IllegalArgumentException

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseUser(
    val email: String,
    val name: String,
    val userId: String,
    val orders: List<ResponseOrder>?
) {

    companion object {
        fun from(userDto: UserDto) = ResponseUser(userDto.email, userDto.name,
            userDto.userId?: throw IllegalArgumentException("id not set"), userDto.orders)
    }
}