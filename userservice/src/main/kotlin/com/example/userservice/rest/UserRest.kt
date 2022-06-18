package com.example.userservice.rest

import com.example.userservice.dto.RequestUser
import com.example.userservice.dto.ResponseUser
import com.example.userservice.dto.UserDto
import com.example.userservice.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user-service")
class UserRest(
    val userService: UserService
) {

    @PostMapping("/users")
    fun createUser(@RequestBody user: RequestUser): ResponseEntity<ResponseUser> {
        val userDto = UserDto(email = user.email, pwd = user.pwd, name = user.name)
        val response = userService.createUser(userDto)

        return ResponseEntity<ResponseUser>(ResponseUser.from(response), HttpStatus.CREATED)
    }
}