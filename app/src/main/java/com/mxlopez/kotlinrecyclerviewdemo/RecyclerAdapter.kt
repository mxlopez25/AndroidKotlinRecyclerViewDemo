package com.mxlopez.kotlinrecyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val list: Array<String>, private val desc: Array<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = list[position]
        holder.itemDetails.text = desc[position]
        holder.itemImage.setImageResource(R.drawable.ic_launcher_background)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetails: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_view)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetails = itemView.findViewById(R.id.item_detail)
        }
    }
}