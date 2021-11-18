package com.dsckiet.petapp.view.sample

import com.dsckiet.petapp.R
import com.dsckiet.petapp.view.model.ChatsItem

object Chats {

    fun getStaticChats(): ArrayList<ChatsItem> {
        val chatsList = ArrayList<ChatsItem>()

        val chat1 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat1)

        val chat2 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat2)

        val chat3 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat3)

        val chat4 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat4)

        val chat5 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat5)

        val chat6 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat6)

        val chat7 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat7)

        val chat8 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat8)

        val chat9 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat9)

        val chat10 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat10)

        val chat11 = ChatsItem(R.drawable.doggy, "Rocky", "New to pet app", "10:10")
        chatsList.add(chat11)

        return chatsList
    }
}