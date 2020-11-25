package com.example.pokemon.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.pokemon.R
import com.example.pokemon.ui.state.TestState
import com.example.pokemon.ui.viewmodel.TestViewModel
import io.uniflow.androidx.flow.onStates
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var testViewModel: TestViewModel
    private lateinit var testBtn: Button
    private lateinit var nameTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testViewModel = getViewModel()
        testBtn = findViewById(R.id.test_btn)
        nameTv = findViewById(R.id.name_tv)


        onStates(testViewModel) { state ->
            when (state) {
                is TestState -> nameTv.text = state.name
            }
        }

        testBtn.setOnClickListener {
            testViewModel.getTest()

        }


    }

}
