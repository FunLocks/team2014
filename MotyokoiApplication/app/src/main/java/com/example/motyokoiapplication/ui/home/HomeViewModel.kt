package com.example.motyokoiapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "食堂の収容人数　38人/89人"
    }
    val text: LiveData<String> = _text
}