package com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit

import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityProfileEditBinding

class ProfileEditActivity:BaseActivity<ActivityProfileEditBinding>(ActivityProfileEditBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val emailValue = sharedPreference.getString("email", "email")
        val pwValue = sharedPreference.getString("password", "password")
        val nameValue = sharedPreference.getString("name", "name")
        val birthValue = sharedPreference.getString("birth", "birth")
        val phoneValue = sharedPreference.getString("phone", "phone")
        val addressValue = sharedPreference.getString("address", "address")

        binding.profileEditEditId.setText(emailValue)
        binding.profileEditEditPw.setText(pwValue)
        binding.profileEditEditName.setText(nameValue)
        binding.profileEditEditBirthday.setText(birthValue)
        binding.profileEditEditNumber.setText(phoneValue)
        binding.profileEditEditTown.setText(addressValue)

        setListener()
    }

    private fun setListener(){
        binding.profileEditImgBack.setOnClickListener {
            finish()
        }
    }
}