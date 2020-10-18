package ru.otus.homework4.service

import ru.otus.homework4.model.User

interface UserService {
    fun getUsers(): List<User>

    fun createUser(user: User): User

    fun getUserById(userId: Long): User

    fun updateUser(userId: Long, newUser: User): User

    fun deleteUser(userId: Long)
}