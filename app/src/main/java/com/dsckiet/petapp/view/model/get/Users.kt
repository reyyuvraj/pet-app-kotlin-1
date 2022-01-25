package com.dsckiet.petapp.view.model.get


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

class Users : ArrayList<Users.UsersSubList>(){
    class UsersSubList : ArrayList<Int>()
}