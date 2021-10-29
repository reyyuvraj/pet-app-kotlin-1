package com.dsckiet.petapp.view.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PostOwnerData(
    @Json(name = "breed")
    var breed: String = "Husky",
    @Json(name = "category")
    var category: String = "Dog",
    @Json(name = "description")
    var description: String,
    @Json(name = "email")
    var email: String,
    @Json(name = "gender")
    var gender: String,
    @Json(name = "name")
    var name: String,
    @Json(name = "password")
    var password: String,
    @Json(name = "pet_name")
    var petName: String,
    @Json(name = "username")
    var username: String
) : Parcelable