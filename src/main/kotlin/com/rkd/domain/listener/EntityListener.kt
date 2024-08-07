package com.rkd.domain.listener

import com.rkd.domain.model.EntityModel
import jakarta.persistence.PreUpdate
import java.time.LocalDateTime

class EntityListener {
    @PreUpdate
    fun preUpdate(entityModel: EntityModel) {
        entityModel.lastChanged = LocalDateTime.now()
    }
}