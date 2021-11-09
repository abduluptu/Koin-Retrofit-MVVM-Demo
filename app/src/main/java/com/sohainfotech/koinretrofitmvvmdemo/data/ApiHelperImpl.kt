package com.sohainfotech.koinretrofitmvvmdemo.data

import com.sohainfotech.koinretrofitmvvmdemo.data.model.User
import retrofit2.Response

//step7: create api helper implementer class


class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

    /*override suspend fun getUsers(): Response<List<User>> {
        return apiService.getUsers()
    }*/

}