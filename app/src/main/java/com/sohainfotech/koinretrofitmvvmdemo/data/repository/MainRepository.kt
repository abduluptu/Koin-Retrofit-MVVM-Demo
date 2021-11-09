package com.sohainfotech.koinretrofitmvvmdemo.data.repository

import com.sohainfotech.koinretrofitmvvmdemo.data.ApiHelper

//step9: create Repository class

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()
}