package com.sohainfotech.koinretrofitmvvmdemo.di.module

import com.sohainfotech.koinretrofitmvvmdemo.ui.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

// step2: di

val viewModelModule  = module {
    viewModel {
        MainViewModel(get(), get())
    }
}