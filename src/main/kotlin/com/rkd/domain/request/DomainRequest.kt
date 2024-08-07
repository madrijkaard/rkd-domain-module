package com.rkd.domain.request

import com.fasterxml.jackson.annotation.JsonProperty

data class DomainRequest(
    @JsonProperty("name")
    val name: String
)