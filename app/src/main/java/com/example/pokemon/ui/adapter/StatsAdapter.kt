package com.example.pokemon.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.entity.Stat
import com.example.entity.Stats
import com.example.pokemon.databinding.StatItemBinding

open class StatsAdapter : RecyclerView.Adapter<StatsAdapter.StatViewHolder>() {


    var mData: List<Stats> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()

        }

    var onItemClickListener: (Stats) -> Unit = {}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: StatItemBinding = StatItemBinding.inflate(layoutInflater, parent, false)
        return StatViewHolder(itemBinding)
    }


    override fun onBindViewHolder(holder: StatViewHolder, position: Int) {
        holder.bind(mData[position])
    }


    override fun getItemCount(): Int {
        return mData.size
    }


    class StatViewHolder(binding: StatItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private var binding: StatItemBinding = binding

        fun bind(stats: Stats) {
            binding.stat = stats.stat
            binding.effort = stats.effort.toString()
            binding.executePendingBindings()
        }
    }


}