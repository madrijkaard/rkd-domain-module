package com.rkd.domain.request

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectRequest(
    @JsonProperty("name")
    val name: String
)