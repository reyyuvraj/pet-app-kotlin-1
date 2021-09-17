package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentSignup2Binding
import kotlinx.android.synthetic.main.fragment_signup2.*

class SignUpAboutOwnerFragment : Fragment() {
    private lateinit var binding: FragmentSignup2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup2, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_signup2Fragment_to_signup3Fragment)
        }
    }

    private fun userSignUp(){
        val name = binding.etYourName
        val username = binding.etUsername
        val email= binding.etEmail
        val password = binding.etPassword
        val cPassword = binding.etCnfpassword

        if(password.length() < 6){
            binding.etPassword.error = "Password should be at least 6 characters long."
            binding.etPassword.requestFocus()
        }

        if(cPassword != password){
            binding.etCnfpassword.error = "Passwords do not match."
            binding.etCnfpassword.requestFocus()
        }
    }
}