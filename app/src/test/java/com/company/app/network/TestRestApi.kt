package com.company.app.network

import com.company.app.database.User
import retrofit2.Response
import java.lang.RuntimeException

// The intention here is to have each test override each call/function as needed
open class TestRestApi : RestApi {
    companion object {
        private const val GENERIC_REASON = "Not implemented"
    }

    override suspend fun login(body: RestApi.LoginBody): Response<User> {
        throw RuntimeException(GENERIC_REASON)
    }
}