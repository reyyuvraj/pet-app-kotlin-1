package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.CommonToolbarBinding
import com.google.android.material.snackbar.Snackbar

class Toolbar : Fragment() {

    private lateinit var binding: CommonToolbarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CommonToolbarBinding.inflate(layoutInflater)

        binding.toolbarSide.setOnClickListener {
            findNavController().navigate(R.id.fragmentSideNavigation)
        }

        binding.toolbarSearch.setOnClickListener {
            val snackBar = Snackbar.make(it, "For search layout", Snackbar.LENGTH_SHORT)
            snackBar.animationMode = Snackbar.ANIMATION_MODE_SLIDE
            snackBar.show()
        }

        return binding.root
    }
}