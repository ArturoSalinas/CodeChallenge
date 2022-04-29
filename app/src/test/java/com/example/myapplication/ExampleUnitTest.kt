package com.example.myapplication

import com.example.myapplication.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleUnitTest {
    val mainViewModel: MainViewModel = mock(MainViewModel::class.java)

    @Test
    fun testin(){
        Mockito.`when`(mainViewModel.getSavedString()).thenReturn("TEST")

        mainViewModel.saveString("TEST")

        assertTrue(mainViewModel.getSavedString() == "TEST")
    }

}