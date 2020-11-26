package com.example.pokemon.ui.view

import PokemonAdapter
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.coroutineScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.ui.state.PokemonState
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import io.uniflow.androidx.flow.onStates
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var testViewModel: PokemonViewModel

    //private lateinit var testBtn: Button
    //private lateinit var nameTv: TextView
    private lateinit var pokemonRv: RecyclerView
    private var pokemonAdapter: PokemonAdapter = PokemonAdapter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testViewModel = getViewModel()
        // testBtn = findViewById(R.id.test_btn)
        // nameTv = findViewById(R.id.name_tv)
        pokemonRv = findViewById(R.id.pokemon_rv)

        pokemonRv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = pokemonAdapter
        }

        this.lifecycle .coroutineScope.launch{
            testViewModel.list.collectLatest{
                pokemonAdapter.submitData(it)
            }
        }



        /*
        onStates(testViewModel) { state ->
            when (state) {
                is PokemonState -> nameTv.text = state.name
            }
        }
        testBtn.setOnClickListener {
            testViewModel.getPokemonList()

        }*/

    }

}
