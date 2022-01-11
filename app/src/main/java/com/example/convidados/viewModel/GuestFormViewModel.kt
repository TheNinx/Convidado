package com.example.convidados.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuestFormViewModel: ViewModel() {

    private  var mSaveGuest = MutableLiveData<Boolean>() // VALOR PODE SER ALTERADO
    val saveGuest: LiveData<Boolean> = mSaveGuest // VALOR NÃO PODE SER ALTERADO

    fun save(name: String, presence: Boolean){

    }
}