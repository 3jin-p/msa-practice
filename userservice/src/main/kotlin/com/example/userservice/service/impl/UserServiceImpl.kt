package com.example.userservice.service.impl

import com.example.userservice.dto.ResponseOrder
import com.example.userservice.dto.UserDto
import com.example.userservice.entity.UserEntity
import com.example.userservice.repository.UserRepository
import com.example.userservice.service.UserService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException
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

    override fun getUserByUserId(userId: String): UserDto {
        val userEntity = userRepository.findByUserId(userId)?: throw IllegalArgumentException("해당하는 유저 없음")

        val userDto = UserDto.from(userEntity)
        val orders = mutableListOf<ResponseOrder>()
        userDto.orders = orders

        return userDto
    }

    override fun getUserByAll(): Iterable<UserDto> = userRepository.findAll().map { u -> UserDto.from(u) }

}