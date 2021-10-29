package com.dsckiet.petapp.view.model

import com.squareup.moshi.Json

data class LoginResponse(
    @Json(name = "msg")
    var response: String?
)