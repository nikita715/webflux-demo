package com.example.webfluxdemo.controller

import com.example.webfluxdemo.dto.UserDto
import com.example.webfluxdemo.entity.User
import com.example.webfluxdemo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userRepository: UserRepository,
) {

    @GetMapping("/{id}")
    suspend fun getUser(@PathVariable id: Long): User? {
        return userRepository.findById(id)
    }

    @PostMapping
    suspend fun saveUser(@RequestBody userDto: UserDto): User? {
        return userRepository.save(User(name = userDto.name))
    }

}