package com.example.pokemon.ui.view.pokemon

import PokemonAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.coroutineScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel


class PokemonListFragment : Fragment() {

    private lateinit var pokemonRv: RecyclerView
    private var pokemonAdapter: PokemonAdapter = PokemonAdapter()
    private lateinit var testViewModel: PokemonViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        testViewModel = getViewModel()
        pokemonRv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = pokemonAdapter
        }

        this.lifecycle.coroutineScope.launch {
            testViewModel.list.collectLatest {
                pokemonAdapter.submitData(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pokemon_list_fragment, container, false)
        pokemonRv = view.findViewById(R.id.pokemon_rv)
        return view
    }


}