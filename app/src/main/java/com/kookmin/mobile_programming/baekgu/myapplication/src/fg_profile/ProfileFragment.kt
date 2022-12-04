package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile

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
        binding.fgProfileTvProfileEdit.setOnClickListener {
            var intent= Intent(requireContext(), ProfileEditActivity::class.java)
            startActivity(intent)
        }

        binding.fgProfileTvLogout.setOnClickListener {
            Firebase.auth.signOut()
            var intent= Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
    }
}