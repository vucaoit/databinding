package com.example.databinding.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.databinding.R
import com.example.databinding.databinding.FragmentMainBinding
import com.example.databinding.ui.showdata.ShowDataFragmnet
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import kotlin.random.Random

class MainFragment : Fragment() {
private var binding: FragmentMainBinding? = null
    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: SearchViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.searchViewModel = viewModel
        binding?.recycle?.adapter = SearchResultAdapter()
//        binding?.btn?.setOnClickListener {
//            viewModel.username.name = (0..10).random().toString()
//        }

    }

}