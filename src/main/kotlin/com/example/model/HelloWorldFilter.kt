package com.example.model

import com.example.annotation.FieldValidator
import io.micronaut.core.annotation.Introspected

@Introspected
data class HelloWorldFilter(
    @FieldValidator
    val field: String?
)