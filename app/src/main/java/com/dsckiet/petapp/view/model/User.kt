package com.dsckiet.petapp.view.model

import com.squareup.moshi.Json

data class User(
    @Json(name = "email")
    var email: String?,
    @Json(name = "id")
    var id: Int?,
    @Json(name = "password")
    var password: String?,
    @Json(name = "username")
    var username: String?
)