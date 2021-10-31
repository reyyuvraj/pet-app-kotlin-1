package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsckiet.petapp.databinding.FragmentForumBinding
import com.dsckiet.petapp.view.adapter.ChatsAdapter
import com.dsckiet.petapp.view.model.ChatsItem
import com.dsckiet.petapp.view.viewmodel.ViewModel

class ForumFragment : Fragment() {

    private lateinit var binding: FragmentForumBinding
    private lateinit var adapterChats: ChatsAdapter
    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForumBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val chatsRecyclerView: RecyclerView = binding.forumChatRecyclerView
        chatsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        adapterChats = ChatsAdapter(requireContext())
        chatsRecyclerView.adapter = adapterChats

        viewModel.chatData.observe(viewLifecycleOwner, {
            adapterChats.setData(it as ArrayList<ChatsItem>)
        })
    }
}