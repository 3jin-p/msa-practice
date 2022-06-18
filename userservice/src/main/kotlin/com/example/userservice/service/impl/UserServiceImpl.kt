package com.example.userservice.service.impl

import com.example.userservice.dto.UserDto
import com.example.userservice.entity.UserEntity
import com.example.userservice.repository.UserRepository
import com.example.userservice.service.UserService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    val userRepository: UserRepository,
    val passwordEncoder: BCryptPasswordEncoder
): UserService {

    override fun createUser(userDto: UserDto): UserDto {
        val userEntity = UserEntity(
                userId = UUID.randomUUID().toString(),
                name = userDto.name,
                email = userDto.email,
                encryptedPwd = passwordEncoder.encode(userDto.pwd)
            )

        val result = userRepository.save(userEntity)
        return UserDto.from(result)
    }
}