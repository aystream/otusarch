package ru.otus.homework4.dto.mapper

interface EntityMapper<D, E> {

    fun toEntity(dto: D): E

    fun toDto(entity: E): D

    fun toEntites(dtoList: MutableList<D>): MutableList<E>

    fun toDtos(entityList: MutableList<E>): MutableList<D>
}