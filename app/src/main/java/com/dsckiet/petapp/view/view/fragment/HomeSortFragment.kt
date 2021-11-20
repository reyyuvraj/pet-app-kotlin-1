package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsckiet.petapp.databinding.BottomSheetHomeSortBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class HomeSortFragment : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetHomeSortBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetHomeSortBinding.inflate(layoutInflater)

        return binding.root
    }
}