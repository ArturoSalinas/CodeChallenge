package com.example.myapplication.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.myapplication.main.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: Application) {

    @Provides @Singleton
    fun provideApplication() = app

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences {
        return app.getSharedPreferences("test", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providesViewModel(sharedPreferences: SharedPreferences): MainViewModel {
        return MainViewModel(sharedPreferences)
    }

}