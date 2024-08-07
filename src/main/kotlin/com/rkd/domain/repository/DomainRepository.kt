package com.rkd.domain.repository

import com.rkd.domain.model.DomainModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DomainRepository : JpaRepository<DomainModel, Long>