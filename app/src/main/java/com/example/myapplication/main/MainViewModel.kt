package com.example.myapplication.main

import android.app.Application
import android.content.SharedPreferences
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val sharedPreferences: SharedPreferences
) : ViewModel(){

    fun saveString(text: String){
        sharedPreferences.edit().putString("TEST",text).apply()
    }

    fun getSavedString(): String {
        return sharedPreferences.getString("TEST","DEFAULT") ?: "DEFAULT"
    }
}