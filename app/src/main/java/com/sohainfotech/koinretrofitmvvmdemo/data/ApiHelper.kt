package com.sohainfotech.koinretrofitmvvmdemo.data

import com.sohainfotech.koinretrofitmvvmdemo.data.model.User
import retrofit2.Response

//step6: create api helper

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}