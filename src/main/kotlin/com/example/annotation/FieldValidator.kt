package com.example.annotation

import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.RUNTIME

@Retention(RUNTIME)
@Constraint(validatedBy = [])
annotation class FieldValidator(
    val message: String = "invalid format ({validatedValue})"
)