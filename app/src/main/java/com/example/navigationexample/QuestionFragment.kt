package com.example.navigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationexample.ViewModel.viewBinding
import com.example.navigationexample.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment(R.layout.fragment_question) {
    private val binding by viewBinding(FragmentQuestionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cevaplabuton.setOnClickListener {
            val answers = binding.editText1.text.toString()
            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToMessageDialog(answers))
        }
    }
}