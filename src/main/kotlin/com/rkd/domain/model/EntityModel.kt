package com.rkd.domain.model

import com.rkd.domain.converter.StatusTypeConverter
import com.rkd.domain.listener.EntityListener
import com.rkd.domain.type.StatusType
import jakarta.persistence.Column
import jakarta.persistence.Convert
import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime
import java.util.UUID

@MappedSuperclass
@EntityListeners(EntityListener::class)
open class EntityModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0,

    @Column(name = "code", nullable = false, length = 36)
    var code: String = UUID.randomUUID().toString(),

    @Convert(converter = StatusTypeConverter::class)
    @Column(name = "status", nullable = false, length = 1)
    var status: StatusType = StatusType.ACTIVE,

    @Column(name = "creation_date", nullable = false)
    var creationDate: LocalDateTime = LocalDateTime.now(),

    @Column(name = "last_changed", nullable = false)
    var lastChanged: LocalDateTime = LocalDateTime.now()
)