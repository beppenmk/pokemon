package com.example.pokemon.ui.viewmodel


import com.example.entity.TestEntity
import com.example.pokemon.ui.state.TestState
import com.example.usecase.GetTestUseCase
import io.uniflow.androidx.flow.AndroidDataFlow
import io.uniflow.core.flow.data.UIState
import kotlinx.coroutines.ExperimentalCoroutinesApi


@OptIn(ExperimentalCoroutinesApi::class)
class TestViewModel(
    private val getTestUseCase: GetTestUseCase,

    ) : AndroidDataFlow(defaultState = UIState.Empty) {



    fun getTest() = action {
        var response = getTestUseCase.invoke() as TestEntity
        setState { TestState(name = response.name ?: "") }
    }



}