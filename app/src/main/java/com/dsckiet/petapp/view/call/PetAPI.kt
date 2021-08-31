package com.dsckiet.petapp.view.call

import retrofit2.http.*

interface PetAPI {

    companion object {
        const val doc = "https://documenter.getpostman.com/view/16864988/TzzHksRf"
        const val baseURL = "https://ancient-earth-36601.herokuapp.com"
        const val sampleToken = "gbff0078ajg4vt10oc6s56fp2rprdpze"
    }

    @POST("/login/register")
    fun postRegister(
    )

    @POST("/login/register")
    fun postLogin(
    )

    @GET("/login/register")
    fun getLogout(
        @Header("token")
        token: String = "ok"
    )
}