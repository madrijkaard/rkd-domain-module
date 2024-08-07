package com.rkd.domain.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "column")
class ColumnModel(
    @Column(name = "name", nullable = false, length = 50)
    var name: String,

    @ManyToOne
    @JoinColumn(name = "domain_id", nullable = false)
    var domain: DomainModel,

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    var type: TypeModel
): EntityModel()