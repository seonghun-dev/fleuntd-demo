package org.streetdrop.demo1

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class HealthController {
    private val log = LoggerFactory.getLogger(this.javaClass)!!
    @GetMapping("/health")
    fun healthCheck(): Map<String, String> {
        log.info("Health check api called")
        return mapOf("status" to "UP")
    }
}