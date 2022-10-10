package com.example.webfluxdemo.repository

import com.example.webfluxdemo.entity.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository : CoroutineCrudRepository<User, Long>