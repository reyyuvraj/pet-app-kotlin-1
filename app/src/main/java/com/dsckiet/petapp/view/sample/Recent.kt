package com.dsckiet.petapp.view.sample

import com.dsckiet.petapp.R
import com.dsckiet.petapp.view.model.ItemRecent

object Recent {

    fun getStaticRecent(): ArrayList<ItemRecent>{
        val recentList = ArrayList<ItemRecent>()

        val recent1 = ItemRecent(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        recentList.add(recent1)

        return recentList
    }
}