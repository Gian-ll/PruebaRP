package com.example.myapplication
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {
    private val _numero = MutableLiveData(0)

    val numero: LiveData <Int> get()= _numero
    fun incrementar(){
        _numero.value = (_numero.value ?: 0) +1
    }
    fun decrementar(){
        val actual = _numero.value ?: 0
        if (actual > 0)_numero.value = actual - 1
    }
}