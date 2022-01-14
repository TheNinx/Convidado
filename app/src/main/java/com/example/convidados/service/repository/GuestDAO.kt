package com.example.convidados.service.repository

import androidx.room.*
import com.example.convidados.service.model.GuestModel


@Dao //CAMADA DE ACESSO AOS DADOS
interface  GuestDAO {

    @Insert
    fun save(guest: GuestModel) : Long //id que foi inserido

    @Update
    fun update(guest: GuestModel): Int //Retorna numero de registros atualizados

    @Delete
    fun deletar(guest: GuestModel) //: Int //numero de registro removidados

    @Query("SELECT * FROM Guest WHERE  id = :id")
    fun get(id: Int): GuestModel

    @Query("SELECT * FROM Guest")
    fun getInvited(): List<GuestModel>

    @Query("SELECT * FROM Guest WHERE presence = 1")
    fun getPresent(): List<GuestModel>

    @Query("SELECT * FROM Guest WHERE presence = 0")
    fun getAnsent(): List<GuestModel>




}