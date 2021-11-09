package com.sohainfotech.koinretrofitmvvmdemo.di.module

import com.sohainfotech.koinretrofitmvvmdemo.data.repository.MainRepository
import org.koin.dsl.module

// step3: di

val repoModule = module {
   single {
       MainRepository(get())
   }
}