package com.dsckiet.petapp.view.model


import com.squareup.moshi.Json

data class PostLogin(
    @Json(name = "password")
    var password: String?,
    @Json(name = "username")
    var username: String?
)