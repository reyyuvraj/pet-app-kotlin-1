package com.dsckiet.petapp.view.call

import retrofit2.http.*

interface PetAPI {

    companion object {
        const val baseURL = "https://ancient-earth-36601.herokuapp.com"
        const val sampleToken = "gbff0078ajg4vt10oc6s56fp2rprdpze"
    }

    @POST("/login/register")
    fun postRegister(
    )

    @POST("/login/login")
    fun postLogin(
    )

    @GET("/login/logout")
    fun getLogout(
        @Header("token")
        token: String = "ok"
    )
}