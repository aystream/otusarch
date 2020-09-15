package ru.otus.homework1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.otus.homework1.dto.HealthDTO

@RestController
@RequestMapping
class HealthController {

    @GetMapping("/health")
    fun health(): HealthDTO {
        return HealthDTO("OK");
    }
}
