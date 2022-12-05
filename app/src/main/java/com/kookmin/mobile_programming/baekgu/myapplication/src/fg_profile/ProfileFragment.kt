package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProfileBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.login.LoginActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit.ProfileEditActivity

class ProfileFragment: BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::bind, R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListener()
    }


    private fun setListener(){
        // 마이페이지 개인정보 표시
        val sharedPreference = requireContext().getSharedPreferences("userInfo", Context.MODE_PRIVATE)
        val nameValue = sharedPreference.getString("name", "유저 이름")
        val emailValue = sharedPreference.getString("email", "유저 이메일")
        binding.fgProfileTvUserName.setText(nameValue)
        binding.fgProfileTvEmail.setText(emailValue)

        // 개인정보 수정 페이지로 이동
        binding.fgProfileLayoutSetting.setOnClickListener {
            var intent= Intent(requireContext(), ProfileEditActivity::class.java)
            startActivity(intent)
        }

        // 로그아웃 기능
        binding.fgProfileTvLogout.setOnClickListener {
            Firebase.auth.signOut()
            var intent= Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
    }
}