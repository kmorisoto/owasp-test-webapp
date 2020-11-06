package com.example.auth

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.views.View
import java.util.*

@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/login")
class LoginAuthController {

    @Get("/auth")
    @View("auth/auth")
    fun auth(): Map<String, Any> {
        return HashMap()
    }

    @Get("/authFailed")
    @View("auth/auth")
    fun authFailed(): Map<String, Any> {
        return mapOf(Pair("errors", true))
    }
}
