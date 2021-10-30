package com.dsckiet.petapp.view.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.dsckiet.petapp.view.model.LoginResponse
import com.dsckiet.petapp.view.model.PostOwnerData
import com.dsckiet.petapp.view.model.RegisterResponse
import com.dsckiet.petapp.view.repository.Repository
import retrofit2.Response

class ViewModel(application: Application) : AndroidViewModel(application) {

    val registerData: LiveData<Response<RegisterResponse>>
    val loginData: LiveData<Response<LoginResponse>>

    private val repository = Repository(application)

    init {
        this.registerData = repository.registerData
        this.loginData = repository.loginData
    }

    fun postRegister(postRegister: PostOwnerData) {
        repository.postRegister(postRegister)
    }

    fun postLogin(password: String, username: String) {
        repository.postLogin(password, username)
    }
}