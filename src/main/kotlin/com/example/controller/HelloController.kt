package com.example.controller

import com.example.model.HelloWorldFilter
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import javax.validation.Valid

@Controller("/hello")
open class HelloController {

    @Get("{?filters*}")
    @Produces(MediaType.TEXT_PLAIN)
    open fun index(@Valid filters: HelloWorldFilter): String {
        return filters.toString()
    }
}