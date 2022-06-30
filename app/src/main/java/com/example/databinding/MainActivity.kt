package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.databinding.ui.main.SearchViewModel
import com.example.databinding.ui.showdata.ShowDataFragmnetViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val showViewModel: ShowDataFragmnetViewModel by viewModels()
    private val searchViewmodel: SearchViewModel by viewModels()

    private lateinit var navView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.nav_host_fragment)
        navView = findViewById(R.id.bottomNavigationView)
        navView.setupWithNavController(navController)
    }
}