package com.example.databinding

import com.example.databinding.ui.main.SearchViewModel
import com.example.databinding.ui.showdata.ShowDataFragmnetViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext
import org.koin.dsl.module

class Application: android.app.Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@Application)
            modules(
                listOf(
                    showDataViewModel,searchViewModel
                )
            )
        }
    }
    val showDataViewModel = module {
        viewModel {
            ShowDataFragmnetViewModel()
        }
    }
    val searchViewModel = module {
        viewModel {
            SearchViewModel()
        }
    }
}