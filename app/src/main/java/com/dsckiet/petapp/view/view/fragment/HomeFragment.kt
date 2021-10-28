package com.dsckiet.petapp.view.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsckiet.petapp.R
import com.dsckiet.petapp.databinding.FragmentHomeBinding
import com.dsckiet.petapp.view.adapter.categoriesRecyclerAdapter
import com.dsckiet.petapp.view.adapter.profileRecyclerAdapter
import com.dsckiet.petapp.view.data.categoriesdataSource
import com.dsckiet.petapp.view.data.petprofiledatasource

class HomeFragment : Fragment() {
    private lateinit var profileAdapter: profileRecyclerAdapter
    private lateinit var categoryAdapter: categoriesRecyclerAdapter
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)





        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.rv_recyclerView)
        val topRecycler:RecyclerView=view.findViewById(R.id.rv_topRecyclerview)


        recyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            profileAdapter= profileRecyclerAdapter(requireContext())
            adapter=profileAdapter
        }
        val data2 = petprofiledatasource.createDataSet()
        profileAdapter.submitList(data2)

        topRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            categoryAdapter= categoriesRecyclerAdapter(requireContext())
            adapter=categoryAdapter

        }
        val data3 =categoriesdataSource.createDataSet()
        categoryAdapter.submitcateg(data3)



        binding.IVLocation.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_userprofileFragment)
        }

        binding.ivMenu.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragmentsidenav)
        }


    }


}