package com.example.instagram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapterPost (private val mList: List<ItemsViewModelPost>) :
    RecyclerView.Adapter<CustomAdapterPost.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post_design, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModelPost = mList[position]
        holder.imageView.setImageResource(ItemsViewModelPost.imagepost)
        holder.textView.text=ItemsViewModelPost.textpost
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textview)
    }
}

