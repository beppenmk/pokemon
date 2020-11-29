package com.example.pokemon.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.entity.Stat
import com.example.entity.Stats
import com.example.entity.Type
import com.example.entity.Types
import com.example.pokemon.databinding.StatItemBinding
import com.example.pokemon.databinding.TypeItemBinding

open class TypeAdapter : RecyclerView.Adapter<TypeAdapter.StatViewHolder>() {


    var mData: List<Types> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()

        }
    var onItemClickListener: (Types) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: TypeItemBinding = TypeItemBinding.inflate(layoutInflater, parent, false)
        return StatViewHolder(itemBinding)
    }


    override fun onBindViewHolder(holder: StatViewHolder, position: Int) {
        holder.bind(mData[position])
    }


    override fun getItemCount(): Int {
        return mData.size
    }
    class StatViewHolder(binding: TypeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private var binding: TypeItemBinding = binding
        fun bind(types: Types) {
            binding.type = types.type
            binding.executePendingBindings()
        }
    }


}