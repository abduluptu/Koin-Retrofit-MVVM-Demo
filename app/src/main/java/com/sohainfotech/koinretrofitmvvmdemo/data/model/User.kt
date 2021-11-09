package com.sohainfotech.koinretrofitmvvmdemo.data.model

import com.squareup.moshi.Json

//step4: create model class using moshi

data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)
