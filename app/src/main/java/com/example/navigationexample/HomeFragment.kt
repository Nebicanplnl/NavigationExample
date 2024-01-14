package com.example.navigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigationexample.ViewModel.viewBinding
import com.example.navigationexample.databinding.FragmentHomeBinding
import com.example.navigationexample.databinding.FragmentQuestionBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Button1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_questionFragment)

        }

    }

}