package com.example.pokemon.ui.view.pokemon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.ui.adapter.PokemonAdapter
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel


class PokemonListFragment : Fragment() {

    private lateinit var pokemonRv: RecyclerView
    private lateinit var actionbar: ActionBar
    private lateinit var loader: ProgressBar
    private lateinit var pokemonViewModel: PokemonViewModel
    private lateinit var navController: NavController

    private var pokemonAdapter: PokemonAdapter = PokemonAdapter()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = view.findNavController()
        actionbar.show()
        actionbar.setDisplayHomeAsUpEnabled(false)
        actionbar.title = getString(R.string.pokemon_list)

        pokemonViewModel = getViewModel()
        pokemonRv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = pokemonAdapter
        }

        pokemonAdapter.onItemClickListener = { pokemon ->
            val actionToPokemonDetail: NavDirections =
                PokemonListFragmentDirections.actionPokemonListFragmentToPokemonDetailFragment(
                    pokemon.name
                )
            navController.navigate(actionToPokemonDetail)
        }

        this.lifecycle.coroutineScope.launch {
            pokemonViewModel.list.collectLatest {
                pokemonAdapter.submitData(it)
            }

        }
        viewLifecycleOwner.lifecycleScope.launch {
            pokemonAdapter.loadStateFlow.collectLatest { loadStates ->
                if(loadStates.refresh is LoadState.Loading){
                    loader.visibility = View.VISIBLE
                }else{
                    loader.visibility = View.GONE
                }
                //errorMsg.isVisible = loadState.refresh is LoadState.Error

            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pokemon_list_fragment, container, false)
        pokemonRv = view.findViewById(R.id.pokemon_rv)
        actionbar = (activity as AppCompatActivity?)!!.supportActionBar!!
        loader = view.findViewById(R.id.loader_pb)
        return view
    }


}