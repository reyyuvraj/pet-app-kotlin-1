package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.dsckiet.petapp.R

import com.dsckiet.petapp.databinding.FragmentSignup3Binding
import com.dsckiet.petapp.view.model.PostOwnerData

class SignUpPetCategoryFragment : Fragment() {

    private lateinit var binding: FragmentSignup3Binding
    private val args: SignUpPetCategoryFragmentArgs by navArgs()
    private lateinit var registerData: PostOwnerData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup3, container, false)
        args.postOwnerData

        Log.d("TAG", "onCreateView: ${args.postOwnerData}")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = args.postOwnerData

        binding.btnNext.setOnClickListener {
            findNavController().navigate(SignUpPetCategoryFragmentDirections.actionSignup3FragmentToSignUp4Fragment(petDetails()))
        }
    }

    private fun petDetails(): PostOwnerData {
        val data = args.postOwnerData
        val category = "Dogs"//binding.gvGridview
        val breed = "Husky"//binding.etBreed

        return PostOwnerData(
            breed= breed,
            category = category,
            description = "",
            email = data.email,
            gender = "",
            name = data.name,
            password = data.password,
            petName = "",
            username = data.username
        )
    }
}