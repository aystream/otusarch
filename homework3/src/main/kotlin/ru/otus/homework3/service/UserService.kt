package ru.otus.homework3.service

import ru.otus.homework3.model.User

interface UserService {
    fun getUsers(): List<User>

    fun createUser(user: User): User

    fun getUserById(userId: Long): User

    fun updateUser(userId: Long, newUser: User): User

    fun deleteUser(userId: Long)
}