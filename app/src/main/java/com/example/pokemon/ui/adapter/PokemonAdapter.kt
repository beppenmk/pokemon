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
    PagingDataAdapter<PokemonEntity, PokemonAdapter.MovieViewHolder>(MovieComparator) {

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val view: View = holder.itemView
        val nameTv: TextView = view.findViewById(R.id.name_tv)
        getItem(position)?.let {
            nameTv.text = it.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_item, parent, false)
        )
    }

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view)

    object MovieComparator : DiffUtil.ItemCallback<PokemonEntity>() {
        override fun areItemsTheSame(oldItem: PokemonEntity, newItem: PokemonEntity): Boolean {
            // name is unique.
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: PokemonEntity, newItem: PokemonEntity): Boolean {
            return oldItem.equals(newItem)
        }
    }

}