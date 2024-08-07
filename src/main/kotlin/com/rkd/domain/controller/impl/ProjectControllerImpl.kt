package com.rkd.domain.controller.impl

import com.rkd.domain.controller.ProjectController
import com.rkd.domain.repository.ProjectRepository
import com.rkd.domain.request.ProjectRequest
import org.springframework.http.ResponseEntity

class ProjectControllerImpl(
    private val projectRepository: ProjectRepository
) : ProjectController {
    override fun createProject(request: ProjectRequest): ResponseEntity<Void> {
        TODO("Not yet implemented")
    }
}