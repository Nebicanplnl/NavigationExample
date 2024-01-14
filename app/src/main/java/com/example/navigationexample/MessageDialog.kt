package com.example.navigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationexample.ViewModel.viewBinding
import com.example.navigationexample.databinding.DialogMessageBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MessageDialog: BottomSheetDialogFragment() {
    private val binding by viewBinding(DialogMessageBinding::bind)
    private val args: MessageDialogArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_message, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Buttonyes.setOnClickListener {
           findNavController().navigate(MessageDialogDirections.actionMessageDialogToAnswerFragment(args.answers))
        }

        binding.Buttonno.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}