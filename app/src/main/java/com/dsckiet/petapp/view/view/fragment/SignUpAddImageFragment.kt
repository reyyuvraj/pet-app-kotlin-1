package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentSignUp5Binding
import com.dsckiet.petapp.view.model.PostOwnerData


class SignUpAddImageFragment : Fragment() {

    private lateinit var binding: FragmentSignUp5Binding
    private val args: SignUpAddImageFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        args.postOwnerData

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up5, container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(SignUpAddImageFragmentDirections.actionSignUp5FragmentToSignUp6Fragment(petDetails()))
        }
    }

    private fun petDetails(): PostOwnerData {
        val data = args.postOwnerData

        return PostOwnerData(
            breed= data.breed,
            category = data.category,
            description = data.description,
            email = data.email,
            gender = data.gender,
            name = data.name,
            password = data.password,
            petName = data.petName,
            username = data.username
        )
    }

}