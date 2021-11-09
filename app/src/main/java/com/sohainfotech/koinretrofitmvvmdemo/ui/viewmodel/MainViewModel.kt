package com.sohainfotech.koinretrofitmvvmdemo.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sohainfotech.koinretrofitmvvmdemo.data.model.User
import com.sohainfotech.koinretrofitmvvmdemo.data.repository.MainRepository
import com.sohainfotech.koinretrofitmvvmdemo.utils.NetworkHelper
import com.sohainfotech.koinretrofitmvvmdemo.utils.Resource
import kotlinx.coroutines.launch

//step10: create ViewModel class

class MainViewModel(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {

        viewModelScope.launch {
            _users.postValue(Resource.loading(null))

            if (networkHelper.isNetworkConnected()) {

                mainRepository.getUsers().let {

                    if (it.isSuccessful) {

                        _users.postValue(Resource.success(it.body()))

                    } else _users.postValue(Resource.error(it.errorBody().toString(), null))
                }

            } else _users.postValue(Resource.error("No internet connection", null))
        }
    }
}