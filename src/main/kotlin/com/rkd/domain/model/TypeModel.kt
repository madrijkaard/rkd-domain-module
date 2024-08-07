package com.rkd.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "type")
class TypeModel(
    @Column(name = "name", nullable = false, length = 50)
    var name: String,

    @Column(name = "path", nullable = true, length = 255)
    var path: String,

    @ManyToOne
    @JoinColumn(name = "domain_id", nullable = true)
    var domainModel: DomainModel
): EntityModel()