package com.example.pokemon.ui.view.pokemon


import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.entity.PokemonEntity
import com.example.pokemon.R
import com.example.pokemon.databinding.PokemonDetailFragmentBinding
import com.example.pokemon.ui.adapter.StatsAdapter
import com.example.pokemon.ui.adapter.TypeAdapter
import com.example.pokemon.ui.state.PokemonState
import com.example.pokemon.ui.viewmodel.PokemonViewModel
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import io.uniflow.androidx.flow.onStates
import org.koin.androidx.viewmodel.ext.android.getViewModel


class PokemonDetailFragment : Fragment() {

    private lateinit var actionbar: ActionBar
    private lateinit var pokemonViewModel: PokemonViewModel
    private lateinit var binding: PokemonDetailFragmentBinding
    private lateinit var imageIv: ImageView
    private lateinit var statRecyclerView: RecyclerView
    private lateinit var typeRecyclerView: RecyclerView
    private val statAdapter = StatsAdapter()
    private val typeAdapter = TypeAdapter()
    val args: PokemonDetailFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemonViewModel = getViewModel()
        actionbar.show()
        actionbar.setDisplayHomeAsUpEnabled(true)
        args.name?.let {
            actionbar.title = it.capitalize()
            pokemonViewModel.getPokemonDetail(it)
        }


        onStates(pokemonViewModel) { state ->
            when (state) {
                is PokemonState -> populateUI(state.value)

            }
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pokemon_detail_fragment, container, false)
        actionbar = (activity as AppCompatActivity?)!!.supportActionBar!!
        binding = PokemonDetailFragmentBinding.bind(view)
        imageIv = view.findViewById(R.id.image_iv)
        statRecyclerView = view.findViewById(R.id.stats_rv)
        statRecyclerView.adapter = statAdapter

        typeRecyclerView = view.findViewById(R.id.types_rv)
        typeRecyclerView.adapter = typeAdapter
        return view
    }


    private fun populateUI(pokemon: PokemonEntity) {

        binding.pokemon = pokemon

        pokemon.sprites?.other?.dreamWorld?.front_default?.let {
            //GlideToVectorYou.justLoadImage(activity, Uri.parse(it), imageIv)
            GlideToVectorYou
                .init()
                .with(activity)
                .setPlaceHolder(R.drawable.pokemon_logo, R.drawable.pokemon_logo)
                .load(Uri.parse(it), imageIv);
        }
        statAdapter.mData = pokemon.stats
        typeAdapter.mData = pokemon.types


    }

}