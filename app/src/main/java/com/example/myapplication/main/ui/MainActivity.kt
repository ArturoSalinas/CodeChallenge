package com.example.myapplication.main.ui

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.MainApplication
import com.example.myapplication.main.MainViewModel
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : Activity(), View.OnClickListener {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var mainViewModel : MainViewModel

    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        MainApplication.appComponent.inject(this)

        editText = findViewById(R.id.editTextValue)
        textView = findViewById(R.id.textViewValue)
        button = findViewById(R.id.buttonValue)

        button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        mainViewModel.saveString(binding.editTextValue.text.toString())

        textView.setText(mainViewModel.getSavedString())
    }

    //yang_yuan@homedepot.com
}