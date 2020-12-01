package com.example.pokemon.ui.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.entity.PokemonEntity
import com.example.pokemon.R

class PokemonAdapter :
    PagingDataAdapter<PokemonEntity, PokemonAdapter.PokemonViewHolder>(PokemonComparator) {

    var onItemClickListener: (PokemonEntity) -> Unit = {}

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {

        val view: View = holder.itemView
        val nameTv: TextView = view.findViewById(R.id.name_tv)
        getItem(position)?.let { pokemon ->
            nameTv.text = pokemon.name
            view.setOnClickListener {
                onItemClickListener(pokemon)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_item, parent, false)
        )
    }

    class PokemonViewHolder(view: View) : RecyclerView.ViewHolder(view)

    object PokemonComparator : DiffUtil.ItemCallback<PokemonEntity>() {
        override fun areItemsTheSame(oldItem: PokemonEntity, newItem: PokemonEntity): Boolean {
            // name is unique.
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: PokemonEntity, newItem: PokemonEntity): Boolean {
            return oldItem.equals(newItem)
        }
    }

}