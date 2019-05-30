package com.example.android.guesstheword

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object fakeReposoteries {
    private val fruitNames: List<String> = listOf(
            "Apple", "Banana", "Orange", "Kiwi", "Grapes", "Fig",
            "Pear", "Strawberry", "Gooseberry", "Raspberry"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruitNames.first()
    }
    fun getRandomFruiteName():String{
        val random = Random()
        return fruitNames[random.nextInt(fruitNames.size)]




    }
    fun changeFruitName(){
        _currentRandomFruitName.value = getRandomFruiteName()
    }

}

