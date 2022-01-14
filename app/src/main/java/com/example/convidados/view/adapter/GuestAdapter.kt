package com.example.convidados.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.R
import com.example.convidados.service.model.GuestModel
import com.example.convidados.view.listener.GuestListener
import com.example.convidados.view.viewholder.GuestViewHolder

class GuestAdapter : RecyclerView.Adapter<GuestViewHolder>() {

    private var mGuesList: List<GuestModel> = arrayListOf()
    private lateinit var mListener:GuestListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder { //POSSUI A MESMA FUN DE INFLATE MAS CRIA O RECYCLEAR
        val item = LayoutInflater.from(parent.context).inflate(R.layout.row_guest, parent,false)
        return GuestViewHolder(item,mListener)
    }

    override fun getItemCount(): Int {
        return mGuesList.count()
    }

    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {

        holder.bind(mGuesList[position])

    }

    fun updateGuests(list: List<GuestModel>){
            mGuesList = list
        notifyDataSetChanged()

    }

    fun attachListener(listener: GuestListener){
        mListener = listener
    }




}