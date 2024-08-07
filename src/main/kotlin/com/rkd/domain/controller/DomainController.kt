package com.rkd.domain.controller

import com.rkd.domain.request.DomainRequest
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/domains")
interface DomainController {
    @PostMapping
    fun createDomain(@RequestBody request: DomainRequest): ResponseEntity<Void>
}