package com.sohainfotech.koinretrofitmvvmdemo

import android.app.Application
import com.sohainfotech.koinretrofitmvvmdemo.di.module.appModule
import com.sohainfotech.koinretrofitmvvmdemo.di.module.repoModule
import com.sohainfotech.koinretrofitmvvmdemo.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// Step 01: We will first create our Application class App like
// and we will update the Manifest file like, android:name=".App"

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // step4: di

        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }

}