package com.dsckiet.petapp.view.model.get


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GlobalLocation(
    @Json(name = "users")
    var users: List<User?>? = null
) {
    @JsonClass(generateAdapter = true)
    data class User(
        @Json(name = "user_id")
        var userId: Int? = null
    )
}