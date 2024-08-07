package com.rkd.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "project")
class ProjectModel(
    @Column(name = "name", nullable = false, length = 50)
    var name: String,

    @OneToMany(mappedBy = "project", cascade = [CascadeType.ALL], orphanRemoval = true)
    var domains: MutableList<DomainModel> = mutableListOf()
) : EntityModel()