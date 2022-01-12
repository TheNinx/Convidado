package com.example.convidados.viewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.convidados.service.model.GuestModel
import com.example.convidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application.applicationContext
    private val mGuestRepository: GuestRepository = GuestRepository.getInstance(mContext)

    private  var mSaveGuest = MutableLiveData<Boolean>() // VALOR PODE SER ALTERADO
    val saveGuest: LiveData<Boolean> = mSaveGuest // VALOR NÃO PODE SER ALTERADO

    fun save(name: String, presence: Boolean) {
        val guest = GuestModel(name = name, presence = presence)

        mSaveGuest.value = mGuestRepository.save(guest)
    }
}