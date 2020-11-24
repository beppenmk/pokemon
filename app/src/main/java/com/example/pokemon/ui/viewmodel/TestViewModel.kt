package com.example.pokemon.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.usecase.GetTestUseCase

class TestViewModel(
   private val getTestUseCase: GetTestUseCase
) : ViewModel() {

    fun getTest(): Any {
        var response = getTestUseCase.invoke()
        Log.d("TAG", "TEST=>$response")
        return   response
    }
}