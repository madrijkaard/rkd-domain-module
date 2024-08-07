package com.rkd.domain.usecase

import com.rkd.domain.request.DomainRequest
import org.springframework.stereotype.Service

@Service
interface CreateDomainUseCase {
    fun create(request: DomainRequest)
}