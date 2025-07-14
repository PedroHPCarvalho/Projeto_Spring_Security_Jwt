package com.security.jwtsecurity.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0, // Identificador único do usuário, valor padrão 0

    val username: String,
    val password: String,
    val role: String // Papel do usuário (ex: ADMIN, USER, etc.
)
