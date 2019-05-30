package com.example.android.guesstheword

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val currentRandomFruitName: LiveData<String>
        get() = fakeReposoteries.currentRandomFruitName
    fun onChangeRandomFruitClick(){
        fakeReposoteries.changeFruitName()
    }
    @Bindable
    val editTextContent = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent: LiveData<String>
        get() = _displayedEditTextContent
    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value = editTextContent.value
    }
    fun onSelectRandomEditTextFruit() {
        editTextContent.value = fakeReposoteries.getRandomFruiteName()
    }

}