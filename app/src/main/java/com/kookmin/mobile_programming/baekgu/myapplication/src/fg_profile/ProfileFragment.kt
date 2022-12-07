package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProfileBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.login.LoginActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit.ProfileEditActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.survey.SurveyActivity

class ProfileFragment: BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::bind, R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListener()
    }

    override fun onResume() {
        super.onResume()
        setListener()
    }

    // 프레퍼런스 값 업데이트 함수
    private fun updateUI(uid: String?, email: String?, pwValue: String?, nameValue: String?, birthValue: String?, phoneValue: String?, addressValue: String?, heightValue: String?, weightValue: String?) {
        val sharedPreference = requireContext().getSharedPreferences("userInfo", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("uid", uid)
        editor.putString("email", email)
        editor.putString("password", pwValue)
        editor.putString("name", nameValue)
        editor.putString("birth", birthValue)
        editor.putString("phone", phoneValue)
        editor.putString("address", addressValue)
        editor.putString("height", heightValue)
        editor.putString("weight", weightValue)
        editor.commit()
    }


    private fun setListener(){
        // 마이페이지 개인정보 표시
        val sharedPreference = requireContext().getSharedPreferences("userInfo", Context.MODE_PRIVATE)
        val nameValue = sharedPreference.getString("name", "User name")
        val emailValue = sharedPreference.getString("email", "User email")
        binding.fgProfileTvUserName.setText(nameValue)
        binding.fgProfileTvEmail.setText(emailValue)

        val heightValue = sharedPreference.getString("height", "User height")
        val weightValue = sharedPreference.getString("weight", "User weight")
        binding.fgProfileTvHeight.setText("${heightValue}g")
        binding.fgProfileTvWeight.setText("${weightValue}g")

        // 개인정보 수정 페이지로 이동
        binding.fgProfileLayoutSetting.setOnClickListener {
            var intent= Intent(requireContext(), ProfileEditActivity::class.java)
            startActivity(intent)
        }

        // 로그아웃 기능
        binding.fgProfileTvLogout.setOnClickListener {
            Firebase.auth.signOut()
            updateUI(null, null, null, null, null, null, null,null,null)
            var intent= Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }

//        binding.fgProfileTvTargetEdit.setOnClickListener{
//            var intent = Intent(requireContext(),ProfileTargetEditActivity::class.java)
//            startActivity(intent)
//        }

        // 설문조사 수정 페이지로 이동
        binding.fgProfileLayoutSurvey.setOnClickListener{
            var intent = Intent(requireContext(),SurveyActivity::class.java)
            startActivity(intent)
        }
    }
}