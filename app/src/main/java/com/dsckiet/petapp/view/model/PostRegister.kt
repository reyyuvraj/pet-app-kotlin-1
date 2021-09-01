package com.dsckiet.petapp.view.model


import com.squareup.moshi.Json

data class PostRegister(
    @Json(name = "breed")
    var breed: String?,
    @Json(name = "category")
    var category: String?,
    @Json(name = "description")
    var description: String?,
    @Json(name = "email")
    var email: String?,
    @Json(name = "gender")
    var gender: String?,
    @Json(name = "name")
    var name: String?,
    @Json(name = "password")
    var password: String?,
    @Json(name = "pet_name")
    var petName: String?,
    @Json(name = "username")
    var username: String?
)