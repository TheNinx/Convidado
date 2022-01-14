package com.example.convidados.service.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.convidados.service.model.GuestModel


@Database(entities = [GuestModel::class],version = 1)
abstract class GuestDataBase : RoomDatabase() {

    abstract fun guestDAO():GuestDAO

    companion object {

        private lateinit var INSTANCEDB : GuestDataBase

        fun getDataBase(context: Context): GuestDataBase {
            if (!::INSTANCEDB.isInitialized){
                synchronized(GuestDataBase::class){
                    INSTANCEDB = Room.databaseBuilder(context, GuestDataBase::class.java, "guestDB")
                        .allowMainThreadQueries()
                        .build()
                }

            }
            return INSTANCEDB
        }

    }

}