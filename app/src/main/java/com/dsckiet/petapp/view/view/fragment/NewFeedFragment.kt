package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dsckiet.petapp.databinding.FragmentNewFeedBinding

class NewFeedFragment : Fragment() {

    private lateinit var binding: FragmentNewFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNewFeedBinding.inflate(layoutInflater)

        binding.feedToolbar.toolbarTitle.text = "New Feed"

        return binding.root
    }
}