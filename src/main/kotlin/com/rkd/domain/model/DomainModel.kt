package com.rkd.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "domain")
class DomainModel(
    @Column(name = "name", nullable = false, length = 50)
    var name: String,

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    var project: ProjectModel,

    @OneToMany(mappedBy = "domain", cascade = [CascadeType.ALL], orphanRemoval = true)
    var columns: MutableList<ColumnModel> = mutableListOf()
) : EntityModel()