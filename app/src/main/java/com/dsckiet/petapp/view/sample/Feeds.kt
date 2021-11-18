package com.dsckiet.petapp.view.sample

import com.dsckiet.petapp.R
import com.dsckiet.petapp.view.model.FeedsItem

object Feeds {

    fun getStaticFeeds(): ArrayList<FeedsItem>{

        val feedsList = ArrayList<FeedsItem>()

        val feed1 = FeedsItem(R.drawable.doggy, "Rocky", "10:10", true)
        feedsList.add(feed1)

        val feed2 = FeedsItem(R.drawable.doggy, "Rocky", "10:10", true)
        feedsList.add(feed2)

        val feed3 = FeedsItem(R.drawable.doggy, "Rocky", "10:10", true)
        feedsList.add(feed3)

        val feed4 = FeedsItem(R.drawable.doggy, "Rocky", "10:10", true)
        feedsList.add(feed4)

        val feed5 = FeedsItem(R.drawable.doggy, "Rocky", "10:10", true)
        feedsList.add(feed5)

        return feedsList
    }
}