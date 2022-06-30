package com.example.databinding.ui.showdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.databinding.FragmentShowDataFragmnetBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class ShowDataFragmnet : Fragment() {
private var binding:FragmentShowDataFragmnetBinding?=null
    companion object {
        fun newInstance() = ShowDataFragmnet()
    }

    private val viewModel: ShowDataFragmnetViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowDataFragmnetBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}