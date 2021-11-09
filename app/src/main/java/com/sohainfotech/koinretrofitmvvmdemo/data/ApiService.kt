package com.sohainfotech.koinretrofitmvvmdemo.data

import com.sohainfotech.koinretrofitmvvmdemo.data.model.User
import retrofit2.Response
import retrofit2.http.GET

//step5: create api service

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}