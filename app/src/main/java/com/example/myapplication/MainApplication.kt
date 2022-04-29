package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.component.AppComponent
import com.example.myapplication.di.component.DaggerAppComponent
import com.example.myapplication.di.module.AppModule

class MainApplication: Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent =
            DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()

        appComponent.inject(this)
    }
}