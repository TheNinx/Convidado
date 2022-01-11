package com.example.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.convidados.viewModel.GuestFormViewModel
import com.example.convidados.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        setListeners() //Escuta os buttons
        observe()


    }


    override fun onClick(view: View?) {
        val id = view?.id
        if (id == R.id.button_save) {

            val name = editName.text.toString()
            val presence = radio_presence.isChecked

            mViewModel.save(name, presence)
        }
    }

    private fun observe() {
        mViewModel.saveGuest.observe(this, Observer {
            if (it) {
                Toast.makeText(application, "Sucesso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(application, "Falha", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setListeners() {
        button_save.setOnClickListener(this)
    }
}