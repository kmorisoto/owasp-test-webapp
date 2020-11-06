package com.example.auth

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.views.View

@Secured(SecurityRule.IS_AUTHENTICATED)
@Controller("funca")
class FuncAController {
    @Get
    @View("auth/funca")
    fun index() = HttpResponse.ok<String>()

    @Consumes(MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON)
    @Post("/multiple")
    fun multipleConsumes(): HttpResponse<*> {
        return HttpResponse.ok<Any>()
    }
}
