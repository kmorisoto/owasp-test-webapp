package com.example.hello

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@Controller("hello")
class HelloController {
    @Get
    @View("hello/index")
    fun index(): HttpResponse<String> = HttpResponse.ok()
}
