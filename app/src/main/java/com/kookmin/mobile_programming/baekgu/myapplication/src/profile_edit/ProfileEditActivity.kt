package com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit

import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityProfileEditBinding

class ProfileEditActivity:BaseActivity<ActivityProfileEditBinding>(ActivityProfileEditBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()
    }

    private fun setListener(){
        binding.profileEditImgBack.setOnClickListener {
            finish()
        }
    }
}