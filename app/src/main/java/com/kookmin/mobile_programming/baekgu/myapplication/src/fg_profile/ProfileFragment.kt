package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProfileBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit.ProfileEditActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.survey.SurveyActivity

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

//        binding.fgProfileTvTargetEdit.setOnClickListener{
//            var intent = Intent(requireContext(),ProfileTargetEditActivity::class.java)
//            startActivity(intent)
//        }

        binding.fgProfileLayoutSurvey.setOnClickListener{
            var intent = Intent(requireContext(),SurveyActivity::class.java)
            startActivity(intent)
        }
    }
}