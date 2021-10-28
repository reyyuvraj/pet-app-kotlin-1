package com.dsckiet.petapp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsckiet.petapp.R
import com.dsckiet.petapp.view.profilemodel.categories
import com.dsckiet.petapp.view.profilemodel.profile
import kotlinx.android.synthetic.main.home_category_item.view.*

class categoriesRecyclerAdapter(private val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var bar: List<categories> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return categoriesRecyclerAdapter.categoriesViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_category_item, parent, false), context)//messages is xml file
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is categoriesRecyclerAdapter.categoriesViewHolder -> {
                holder.bind(bar.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return bar.size
    }

    fun submitcateg(blogList: List<categories>) {
        bar = blogList
    }

    class categoriesViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView){
        val petprofile=itemView.iv_cat
        val pettype=itemView.tv_pet_type

        fun bind(cate:categories){
            pettype.setText(cate.pet)

            Glide.with(context)
                .load(cate.dp)
                .into(petprofile)
        }
    }
}