package com.example.webfluxdemo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("test_users")
data class User(
    @Id
    val id: Long? = null,
    val name: String,
)
