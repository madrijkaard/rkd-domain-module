package com.rkd.domain.mapper

import com.rkd.domain.model.DomainModel
import com.rkd.domain.request.DomainRequest

fun DomainRequest.toModel(): DomainModel {
    return DomainModel(
        name = this.name
    )
}
