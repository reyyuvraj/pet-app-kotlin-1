package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentCreateEventBinding
import kotlinx.coroutines.flow.combine

class CreateEventFragment : Fragment() {

    private lateinit var binding: FragmentCreateEventBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateEventBinding.inflate(layoutInflater)

        binding.createToolbar.toolbarTitle.text = "Create Event"

        binding.createNextButton.setOnClickListener {
            findNavController().navigate(R.id.action_createEventFragment_to_newFeedMoreFragment)
        }

        return binding.root
    }
}