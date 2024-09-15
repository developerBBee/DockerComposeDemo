package com.example.api.entities

import jakarta.persistence.*

@Entity
@Table(name = "greetings")
data class GreetingEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val lang: String,
    val text: String,
)
