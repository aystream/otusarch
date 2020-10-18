package ru.otus.homework4.service

import org.springframework.stereotype.Service
import ru.otus.homework4.exception.NotFoundException
import ru.otus.homework4.model.User
import ru.otus.homework4.repository.UserRepository

@Service
class UserServiceImpl (private val userRepository: UserRepository) : UserService {
    @Override
    override fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    @Override
    override fun createUser(user: User): User = userRepository.save(user)

    @Override
    override fun getUserById(userId: Long): User {
        return userRepository.findById(userId).map { user ->
            user
        }.orElseThrow{NotFoundException("Not found") }
    }
    @Override
    override fun updateUser(userId: Long, newUser: User): User {
        return userRepository.findById(userId).map { currentUser ->
            val updatedUser: User =
                    currentUser
                            .copy(
                                    username = newUser.username,
                                    firstName = newUser.firstName,
                                    lastName = newUser.lastName,
                                    email = newUser.email,
                                    phone = newUser.phone,
                            )
            userRepository.save(updatedUser)
        }.orElseThrow { NotFoundException("Not found") }
    }

    @Override
    override fun deleteUser(userId: Long) {
        with(userRepository) {
            findById(userId).map { user ->
                delete(user)
            }.orElseThrow{NotFoundException("Not found") }
        }
    }
}