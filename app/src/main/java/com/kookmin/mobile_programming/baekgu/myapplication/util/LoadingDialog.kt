package com.kookmin.mobile_programming.baekgu.myapplication.util

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.DialogLoadingBinding

class LoadingDialog(context:Context): Dialog(context) {

    private lateinit var binding:DialogLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DialogLoadingBinding.inflate(layoutInflater)
        this.setContentView(binding.root)
        this.setCancelable(false)
        this.getWindow()?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

}