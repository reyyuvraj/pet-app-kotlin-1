package com.dsckiet.petapp.view.model

import com.squareup.moshi.Json

data class RegisterResponse(
    @Json(name = "msg")
    var msg: String?,
    @Json(name = "pet")
    var pet: Int?,
    @Json(name = "user")
    var user: List<User>?
)