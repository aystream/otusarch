package ru.otus.homework4.controller

import io.micrometer.core.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.otus.homework1.dto.HealthDTO

@RestController
@RequestMapping
@Timed
class HealthController {

    @Timed(value = "health", percentiles = [0.5, 0.95, 0.99])
    @GetMapping("/health")
    fun health(): HealthDTO {
        return HealthDTO("OK");
    }
}
