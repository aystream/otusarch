package ru.otus.homework4.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonView

data class UserDTO (
    @JsonProperty("id")
    @JsonView(Views.Read::class)
    var id: Long? = null,

    @JsonProperty("username")
    @JsonView(Views.Write::class)
    var username: String? = null,

    @JsonProperty("firstName")
    @JsonView(Views.General::class)
    var firstName: String? = null,

    @JsonProperty("lastName")
    @JsonView(Views.General::class)
    var lastName: String? = null,

    @JsonProperty("email")
    @JsonView(Views.General::class)
    var email: String? = null,

    @JsonProperty("phone")
    @JsonView(Views.General::class)
    var phone: String? = null
)