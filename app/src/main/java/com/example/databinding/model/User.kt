package com.example.databinding.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databinding.BR

class User :BaseObservable(){
//    var name:String = "HELLO"
    @get:Bindable
    var name: String = "HELLO"
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}