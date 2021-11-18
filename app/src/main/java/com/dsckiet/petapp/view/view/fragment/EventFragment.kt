package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentEventBinding
import com.dsckiet.petapp.view.adapter.ChatsAdapter
import com.dsckiet.petapp.view.sample.Chats

class EventFragment : Fragment() {

    private lateinit var binding: FragmentEventBinding
    private lateinit var navController: NavController
    private lateinit var chatsStatic: Chats
    private lateinit var adapterChats: ChatsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEventBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatsStatic = Chats

        val eventRecyclerView: RecyclerView = binding.eventRecyclerView
        eventRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        adapterChats = ChatsAdapter(requireContext())

        if(binding.rgEvent.checkedRadioButtonId == R.id.rb_upcoming){
            eventRecyclerView.adapter = adapterChats
            adapterChats.setData(chatsStatic.getStaticChats())
        }

        binding.rgEvent.setOnCheckedChangeListener { radioGroup, i ->
            if (i== R.id.rb_upcoming){
                eventRecyclerView.adapter = adapterChats
                adapterChats.setData(chatsStatic.getStaticChats())
            } else if (i == R.id.rb_recent){
            }
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