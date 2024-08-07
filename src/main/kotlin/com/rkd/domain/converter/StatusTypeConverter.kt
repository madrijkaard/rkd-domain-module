package com.rkd.domain.converter

import com.rkd.domain.type.StatusType
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class StatusTypeConverter : AttributeConverter<StatusType, String> {

    override fun convertToDatabaseColumn(statusType: StatusType): String {
        return statusType.code
    }

    override fun convertToEntityAttribute(code: String): StatusType {
        return StatusType.fromCode(code)
    }
}