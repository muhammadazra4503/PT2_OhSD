package org.d3ifcool3046.pt2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RumusAdapter(private val RumusList:ArrayList<Rumus>)
    : RecyclerView.Adapter<RumusAdapter.RumusViewHolder>(){

    var onItemClick : ((Rumus) -> Unit)? = null

    class RumusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val kotak : ImageView = itemView.findViewById(R.id.kotak)
        val textView : TextView = itemView.findViewById(R.id.textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RumusViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_rumus, parent , false)
        return RumusViewHolder(view)
    }

    override fun onBindViewHolder(holder: RumusViewHolder, position: Int) {
        val rumus = RumusList[position]
        holder.kotak.setImageResource(rumus.image)
        holder.textView.text = rumus.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(rumus)
        }


    }
    override fun getItemCount(): Int {
        return RumusList.size
    }


    }
