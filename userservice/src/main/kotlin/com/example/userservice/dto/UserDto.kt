package com.example.userservice.dto

import com.example.userservice.entity.UserEntity

data class UserDto(
    val email: String,
    val pwd: String?,
    val name: String,
) {
    var userId: String? = null
    var encryptedPwd: String? = null

    companion object {
        fun from(entity: UserEntity): UserDto {
            val result = UserDto(entity.email, null, entity.name)
            result.userId = entity.userId
            result.encryptedPwd = entity.encryptedPwd
            return result
        }
    }
}
