package com.example.senyaapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.senyaapp.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {
    private var _binding: FragmentHomeBinding?=null
    private val binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = binding.recylerView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}