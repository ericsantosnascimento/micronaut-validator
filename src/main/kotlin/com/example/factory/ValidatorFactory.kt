package com.example.factory

import com.example.annotation.FieldValidator
import io.micronaut.context.annotation.Factory
import io.micronaut.validation.validator.constraints.ConstraintValidator
import jakarta.inject.Singleton

@Factory
class ValidatorFactory {

    @Singleton
    fun fieldPatternValidator(): ConstraintValidator<FieldValidator, CharSequence> {
        return ConstraintValidator { value, annotation, context ->
            context.messageTemplate("invalid format ({validatedValue}), should be test") //
            value == "test"
        }
    }
}