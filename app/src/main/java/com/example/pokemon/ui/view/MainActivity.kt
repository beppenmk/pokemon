package com.example.pokemon.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.pokemon.R
import com.example.pokemon.ui.state.PokemonState
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import io.uniflow.androidx.flow.onStates
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var testViewModel: PokemonViewModel
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
                is PokemonState -> nameTv.text = state.name
            }
        }

        testBtn.setOnClickListener {

            testViewModel.getPokemonList()

        }


    }

}
