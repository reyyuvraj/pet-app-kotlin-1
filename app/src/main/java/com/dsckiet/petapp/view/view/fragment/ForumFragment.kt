package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentForumBinding
import com.dsckiet.petapp.view.adapter.ChatsAdapter
import com.dsckiet.petapp.view.adapter.FeedsAdapter
import com.dsckiet.petapp.view.sample.Chats
import com.dsckiet.petapp.view.sample.Feeds
import com.dsckiet.petapp.view.viewmodel.ViewModel

class ForumFragment : Fragment() {

    private lateinit var binding: FragmentForumBinding
    private lateinit var adapterChats: ChatsAdapter
    private lateinit var adapterFeeds: FeedsAdapter
    private lateinit var viewModel: ViewModel
    private lateinit var chatsStatic: Chats
    private lateinit var feedsStatic: Feeds

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentForumBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatsStatic = Chats
        feedsStatic = Feeds

        val forumRecyclerView: RecyclerView = binding.forumRecyclerView
        forumRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        viewModel.chatsList()
        viewModel.feedsList()

        adapterChats = ChatsAdapter(requireContext())

        adapterFeeds = FeedsAdapter(requireContext())


        /*viewModel.chatData.observe(viewLifecycleOwner, {
            adapterChats.setData(it as ArrayList<ChatsItem>)
        })*/

        if (binding.rgForum.checkedRadioButtonId == (R.id.rb_chats)) {
            forumRecyclerView.adapter = adapterChats
            adapterChats.setData(chatsStatic.getStaticChats())
        }

        binding.rgForum.setOnCheckedChangeListener { _, i ->
            if (i == R.id.rb_chats) {
                forumRecyclerView.adapter = adapterChats
                adapterChats.setData(chatsStatic.getStaticChats())
            } else if (i == R.id.rb_feeds) {
                forumRecyclerView.adapter = adapterFeeds
                adapterFeeds.setData(feedsStatic.getStaticFeeds())
            }
        }

        binding.forumFab.setOnClickListener {
            findNavController().navigate(R.id.action_forumFragment2_to_newFeedFragment)
        }
    }

    /*override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }*/
}