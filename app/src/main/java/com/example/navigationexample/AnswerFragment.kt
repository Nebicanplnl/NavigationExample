package com.example.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationexample.ViewModel.viewBinding
import com.example.navigationexample.databinding.FragmentAnswerBinding
import com.example.navigationexample.databinding.FragmentQuestionBinding


class AnswerFragment : Fragment(R.layout.fragment_answer) {
    private val binding by viewBinding(FragmentAnswerBinding::bind)
    //Aşşağıdaki args bizim için argumanı tanımlıyor aşşağıdaki koda gerek kalmıyor
    //val answers = arguments?.getString("answers")
    private val args: AnswerFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val answers = arguments?.getString("answers")
        binding.results.text = when {
            args.answers.equals("ankara", true) -> "Tebrikler bildiniz"
            else -> "Yalnış bildiniz"
        }
        // popBackStack() = sayfada geri gitmek demek
        binding.answerButton1.setOnClickListener {
            findNavController().popBackStack()
        }
        //Popbackstack'in istediğimiz sayfaya gitmemizi sağlıyor. İnclusive de gittiğimiziz sayfayı uçur demek.
        binding.answerButton2.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment, false)
        }
    }
}