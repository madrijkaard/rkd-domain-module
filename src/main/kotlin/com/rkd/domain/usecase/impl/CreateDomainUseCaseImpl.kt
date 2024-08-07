package com.rkd.domain.usecase.impl

import com.rkd.domain.mapper.toModel
import com.rkd.domain.repository.DomainRepository
import com.rkd.domain.request.DomainRequest
import com.rkd.domain.usecase.CreateDomainUseCase

class CreateDomainUseCaseImpl(
    private val domainRepository: DomainRepository
) : CreateDomainUseCase {

    override fun create(request: DomainRequest) {
        val model = request.toModel()
        domainRepository.save(model)
    }
}