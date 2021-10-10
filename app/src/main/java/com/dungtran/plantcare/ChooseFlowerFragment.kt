package com.dungtran.plantcare

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class ChooseFlowerFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout to use as dialog or embedded fragment
        return inflater.inflate(R.layout.fragment_choose_flower, container, false)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater
            builder.setView(inflater.inflate(R.layout.fragment_choose_flower, null))
//                .setPositiveButton("Chọn",
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // sign in the user ...
//                    })
//                .setNegativeButton("Bỏ",
//                    DialogInterface.OnClickListener { dialog, id ->
//                    })
            builder.create()

        } ?: throw IllegalStateException("Activity cannot be null")
    }
}