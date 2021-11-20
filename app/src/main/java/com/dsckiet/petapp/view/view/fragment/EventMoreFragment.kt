package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentNewFeedMoreBinding

class EventMoreFragment : Fragment() {

    private lateinit var binding: FragmentNewFeedMoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewFeedMoreBinding.inflate(layoutInflater)

        binding.moreToolbar.toolbarTitle.text = "Create Event"

        return binding.root
    }
}