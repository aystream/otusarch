package ru.otus.homework4.dto.mapper

import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy
import ru.otus.homework4.dto.UserDTO
import ru.otus.homework4.model.User


@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface UserMapper: EntityMapper<UserDTO, User> {
}