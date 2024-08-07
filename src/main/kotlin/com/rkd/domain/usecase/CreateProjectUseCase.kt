package com.rkd.domain.usecase

import com.rkd.domain.request.ProjectRequest
import org.springframework.stereotype.Service

@Service
interface CreateProjectUseCase {
    fun create(request: ProjectRequest)
}