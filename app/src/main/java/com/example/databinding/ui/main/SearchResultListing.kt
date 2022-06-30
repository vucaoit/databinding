package com.example.databinding.ui.main

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class SearchResultListing() :BaseObservable() {
    @get:Bindable
    var searchResultList : MutableList<SearchResultItemModel> = mutableListOf()
        set(value) {
            field = value
            notifyPropertyChanged(BR.searchResultList)
        }
}