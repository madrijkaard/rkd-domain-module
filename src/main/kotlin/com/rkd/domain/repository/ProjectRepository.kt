package com.rkd.domain.repository

import com.rkd.domain.model.ProjectModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository : JpaRepository<ProjectModel, Long>