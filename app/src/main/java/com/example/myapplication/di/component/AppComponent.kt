package com.example.myapplication.di.component

import android.app.Application
import com.example.myapplication.di.module.AppModule
import com.example.myapplication.main.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: Application)
    fun inject(mainActivity: MainActivity)
}