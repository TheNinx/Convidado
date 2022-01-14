package com.example.convidados.service.repository

import android.content.ContentValues
import android.content.Context
import android.text.Selection
import com.example.convidados.service.constants.DataBaseConstants
import com.example.convidados.service.model.GuestModel
import java.lang.Exception
import java.util.ArrayList

class GuestRepository (context: Context) {

    // Acesso ao banco de dados
    private val mDataBase = GuestDataBase.getDataBase(context).guestDAO()


    fun get(id: Int): GuestModel? {
        return mDataBase.get(id)
    }

    fun save(guest: GuestModel): Boolean {
        return mDataBase.save(guest) > 0
    }


    //Faz a listagem de todos os convidados

    fun getAll(): List<GuestModel> {
        return mDataBase.getInvited()
    }


      //Faz a listagem de todos os convidados presentes

    fun getPresent(): List<GuestModel> {
        return mDataBase.getPresent()
    }


      //Faz a listagem de todos os convidados presentes

    fun getAbsent(): List<GuestModel> {
        return mDataBase.getAnsent()
    }


      //Atualiza convidado

    fun update(guest: GuestModel): Boolean {
        return mDataBase.update(guest) > 0
    }


     //Remove convidado

    fun delete(id: Int) {
        return delete(id)
    }

}