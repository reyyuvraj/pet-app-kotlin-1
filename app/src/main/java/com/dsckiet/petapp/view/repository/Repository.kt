package com.dsckiet.petapp.view.repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.dsckiet.petapp.view.call.RetrofitInstance
import com.dsckiet.petapp.view.model.*
import com.dsckiet.petapp.view.model.get.feeds.FeedDataCheck
import com.dsckiet.petapp.view.model.get.logout.Logout
import com.dsckiet.petapp.view.model.post.RegisterResponse
import com.dsckiet.petapp.view.util.LocalKeyStorage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class Repository constructor(val application: Application) {

    val localKeyStorage: LocalKeyStorage = LocalKeyStorage(application)
    val registerData = MutableLiveData<Response<RegisterResponse>>()
    val loginData = MutableLiveData<Response<LoginResponse>>()
    val chatData = MutableLiveData<ChatsItem>()
    val feedsData = MutableLiveData<FeedDataCheck>()
    val upcomingData = MutableLiveData<ItemUpcoming>()
    val recentData = MutableLiveData<ItemRecent>()
    val TAG = "Repository"

    fun postRegister(postRegister: PostOwnerData) {

        val retrofitService = RetrofitInstance.getClient(application)
        val callAPI = retrofitService.postRegister(registerBody = postRegister)

        callAPI.enqueue(object : Callback<RegisterResponse> {
            override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                Toast.makeText(application, "${t.message}", Toast.LENGTH_SHORT).show()
                Log.d("Signup", "onResponse: ${t.message}")
            }

            override fun onResponse(
                call: Call<RegisterResponse>,
                response: Response<RegisterResponse>
            ) {
                Log.d("Signup", "onResponse: ${response.raw()}")
                Log.d(TAG, "onResponse: ")
                Log.d("Signup", "onResponse: ${response.body()}")
                Log.d(TAG, "onResponse: $response")
                Log.d("Signup", "onResponse: ${response.errorBody()}")
                val registerResponse = response.body()
                registerData.value = response
            }
        })

    }

    fun postLogin(password: String, username: String) {

        val login = PostLogin(password, username)
        val retrofitService = RetrofitInstance.getClient(application)
        val callAPI = retrofitService.postLogin(auth = "Basic", loginBody = login)

        callAPI.enqueue(object : Callback<LoginResponse> {
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                Toast.makeText(application, "${t.message}", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<LoginResponse>,
                response: Response<LoginResponse>
            ) {
                Toast.makeText(application, "${response.message()}", Toast.LENGTH_SHORT).show()
                Log.d("loginResponse", "onResponse: ${response.body()}")
                val loginResponse = response.body()
                val responseCode: Int = response.code()
                var header: String? = response.headers().get("Set-Cookie")
                Log.d(TAG, "onResponse: ${header}")
                var p: Int? = header?.indexOf(';')
                header = header?.subSequence(10, p!!).toString()
                localKeyStorage.saveValue(LocalKeyStorage.COOKIE, header)
                localKeyStorage.getValue(LocalKeyStorage.COOKIE)

                Log.d(TAG, "onResponse: ${header}")
                loginData.value = response
                Log.d("zx", "onResponse: $response")

                if (loginResponse != null) {
                    val msg = loginResponse.response
                }
            }
        })
    }

    fun getChatList() {}

    fun getFeedsList(cookie: String) {

        val retrofitService = RetrofitInstance.getClient(application)
        val callAPI = retrofitService.getFeed(cookie)

        callAPI.enqueue(object : Callback<FeedDataCheck> {
            override fun onFailure(call: Call<FeedDataCheck>, t: Throwable) {
                Toast.makeText(application, "${t.message}", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<FeedDataCheck>, response: Response<FeedDataCheck>) {
                Log.d("FeedData", "onResponse: ${response}")
                Log.d("FeedData", "onResponse: ${response.body()}")
                val feedData = response.body()
                feedsData.value = feedData
            }
        })

    }

    fun getUpcomingList() {}

    fun getRecentList() {}

    fun getLogout(cookie: String) {

        val retrofitService = RetrofitInstance.getClient(application)
        val callApi = retrofitService.getLogout(cookie)

        callApi.enqueue(object : Callback<Logout>{
            override fun onFailure(call: Call<Logout>, t: Throwable) {
                Toast.makeText(application, "${t.message}", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Logout>, response: Response<Logout>) {
                Log.d("Logout", "onResponse: ${response.message()}")
            }
        })
    }

    fun getGoogleAuth() {
        val retrofitService = RetrofitInstance.getClient(application)
        val callApi = retrofitService.getGoogleAuth()

    }
}