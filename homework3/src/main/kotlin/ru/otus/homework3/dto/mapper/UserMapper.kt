package ru.otus.homework3.dto.mapper

import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ReportingPolicy
import ru.otus.homework3.dto.UserDTO
import ru.otus.homework3.model.User


@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface UserMapper: EntityMapper<UserDTO, User> {
}