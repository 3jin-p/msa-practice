package com.example.userservice.entity

import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity(
    @Column(nullable = false, length = 50, unique = true)
    val email: String,
    @Column(nullable = false, length = 50)
    val name: String,
    @Column(nullable = false, unique = true)
    val userId: String,
    @Column(nullable = false, unique = true)
    var encryptedPwd: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

}