package com.rkd.domain.type

enum class StatusType(val code: String) {

    ACTIVE("A"),
    INACTIVE("I");

    companion object {
        fun fromCode(code: String): StatusType {
            return entries.first { it.code == code }
        }
    }
}