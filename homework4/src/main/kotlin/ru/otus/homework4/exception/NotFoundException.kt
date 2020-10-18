package ru.otus.homework4.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus


@ResponseStatus(value = HttpStatus.NOT_FOUND)
class NotFoundException(template: String?, vararg objs: Any?) : RuntimeException(String.format(template!!, *objs))