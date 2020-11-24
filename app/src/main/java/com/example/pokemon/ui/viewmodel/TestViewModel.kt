package com.example.pokemon.ui.viewmodel

import com.example.usecase.GetTestUseCase

class TestViewModel(
    private var getTestUseCase: GetTestUseCase
) {

    fun getTest(): Any {
        return getTestUseCase.invoke()
    }
}