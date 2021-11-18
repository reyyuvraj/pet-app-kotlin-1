package com.dsckiet.petapp.view.model

data class ChatsItem (
    val profileImage: Int,
    val name: String = "Dave",
    val messages: String = "",
    val chatTime: String = "10:10"
)