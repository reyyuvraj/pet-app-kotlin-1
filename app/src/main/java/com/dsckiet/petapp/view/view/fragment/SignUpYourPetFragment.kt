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
import com.dsckiet.petapp.databinding.FragmentSignUp4Binding
import com.dsckiet.petapp.view.model.PostOwnerData


class SignUpYourPetFragment : Fragment() {

    private lateinit var binding: FragmentSignUp4Binding
    private val args: SignUpYourPetFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up4, container, false)
        args.postOwnerData


        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(SignUpYourPetFragmentDirections.actionSignUp4FragmentToSignUp5Fragment(petDetails()))
        }
    }

    private fun petDetails(): PostOwnerData {
        val data = args.postOwnerData
        val petName = binding.etName.text.toString()
        val description = binding.etAbout.text.toString()
        val gender = "male"

        return PostOwnerData(
            breed= data.breed,
            category = data.category,
            description = description,
            email = data.email,
            gender = gender,
            name = data.name,
            password = data.password,
            petName = petName,
            username = data.username
        )
    }

}