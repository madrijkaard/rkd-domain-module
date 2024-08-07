package com.rkd.domain.controller.impl

import com.rkd.domain.controller.DomainController
import com.rkd.domain.request.DomainRequest
import com.rkd.domain.usecase.CreateDomainUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class DomainControllerImpl(
    private val createDomainUseCase: CreateDomainUseCase
) : DomainController {

    override fun createDomain(request: DomainRequest): ResponseEntity<Void> {
        createDomainUseCase.create(request)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}