package com.example.pokemon.ui.view.pokemon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

import com.example.pokemon.R
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel


class PokemonDetailFragment : Fragment() {

    private lateinit var actionbar: ActionBar
    private lateinit var pokemonViewModel: PokemonViewModel
    val args: PokemonDetailFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemonViewModel = getViewModel()
        actionbar.show()
        actionbar.setDisplayHomeAsUpEnabled(true)
        args.name?.let{
            actionbar.title = it.capitalize()
            pokemonViewModel.getPokemonDetail(it)
        }



    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pokemon_detail_fragment, container, false)
        actionbar = (activity as AppCompatActivity?)!!.supportActionBar!!
        return view
    }

}