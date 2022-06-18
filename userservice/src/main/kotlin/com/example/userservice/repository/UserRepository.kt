package com.example.userservice.repository

import com.example.userservice.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Long> {
}