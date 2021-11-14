package com.dsckiet.petapp.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsckiet.petapp.R
import com.dsckiet.petapp.view.model.FeedsItem

class FeedsAdapter(private val context: Context) : RecyclerView.Adapter<FeedsAdapter.ViewHolder>() {

    private var feedsList: ArrayList<FeedsItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_feed, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = feedsList[position]
        Glide.with(context).load(item.image).into(holder.image)
        holder.name.text = item.name
        holder.time.text = item.time
    }

    override fun getItemCount(): Int {
        return feedsList.size
    }

    inner class ViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.feed_image)
        val name: TextView  = itemView.findViewById(R.id.feed_name)
        val time: TextView = itemView.findViewById(R.id.feed_time)
        val like: ImageView = itemView.findViewById(R.id.feed_like_empty)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(item: ArrayList<FeedsItem>) {
        this.feedsList = item
        notifyDataSetChanged()
    }
}