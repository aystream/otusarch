package ru.otus.homework4.controller

import io.micrometer.core.annotation.Timed
import io.swagger.annotations.Api
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.otus.homework1.dto.HealthDTO
import ru.otus.homework4.dto.UserDTO
import ru.otus.homework4.dto.mapper.UserMapper
import ru.otus.homework4.service.UserService

/**
 * todo вообще user - это не по rest api - так как обычно ресурс задаётся как users
 * (s обязательно, их может быть больше чем один) но в otus так
 */
@RestController
@RequestMapping("/users")
@Api(value="Контроллер пользователей", description="CRUD для пользователями")
class UserController(private val userService: UserService, private var userMapper: UserMapper) {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getUserById(@PathVariable("id") id: Long): ResponseEntity<UserDTO> {
        return ResponseEntity(userMapper.toDto(userService.getUserById(id)), HttpStatus.OK)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody userDto: UserDTO): ResponseEntity<UserDTO> {
        return ResponseEntity(userMapper.toDto(userService.createUser(userMapper.toEntity(userDto))), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable("id") id: Long) {
        userService.deleteUser(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun putUser(@PathVariable("id") id: Long, @RequestBody userDto: UserDTO): ResponseEntity<UserDTO> {
        return ResponseEntity(
                userMapper.toDto(userService.updateUser(id, userMapper.toEntity(userDto))), HttpStatus.OK)
    }
}