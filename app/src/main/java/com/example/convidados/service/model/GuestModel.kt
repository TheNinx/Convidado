package com.example.convidados.service.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//IMPLEMENTANDO ROOM ESTE E MINHA ENTIDADE
@Entity(tableName = "Guest")
class GuestModel {


    @PrimaryKey(autoGenerate = true) // autoincrement
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "name")
    var name: String = ""

    @ColumnInfo(name = "presence")
    var presence: Boolean = true
}