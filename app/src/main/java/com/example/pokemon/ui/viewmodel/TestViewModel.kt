package com.example.pokemon.ui.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon.ui.viewmodel.TestViewModel.State.TestRecived
import com.example.usecase.GetTestUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class TestViewModel(
   private val getTestUseCase: GetTestUseCase,

) : ViewModel() {

    val intentChannel = Channel<Intent>(Channel.UNLIMITED)
    private val _state = MutableStateFlow<State>(State.Idle)
    val state: StateFlow<State>
        get() = _state

    sealed class Intent {
        object GetTest : Intent()
    }

    sealed class State {

        object Idle : State()
        object TestRecived : State()
    }


    init {
        viewModelScope.launch {
            handleIntents()
        }
    }


    suspend fun handleIntents(){
        intentChannel.consumeAsFlow().collect { intent ->
            when (intent) {
                Intent.GetTest -> {
                    _state.value = TestRecived
                }
            }
        }

    }




    /***********************/
   /* fun getTest(): Any {
        var response = getTestUseCase.invoke()
        Log.d("TAG", "TEST=>$response")
        return   response
    }*/
}