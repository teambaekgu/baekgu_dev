package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProfileBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit.ProfileEditActivity

class ProfileFragment: BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::bind, R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListener()
    }


    private fun setListener(){
        binding.fgProfileTvProfileEdit.setOnClickListener {
            var intent= Intent(requireContext(),ProfileEditActivity::class.java)
            startActivity(intent)
        }
    }
}