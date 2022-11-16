package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_calendar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentCalendarBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.DietDetailsActivity


class CalendarFragment: BaseFragment<FragmentCalendarBinding>(FragmentCalendarBinding::bind, R.layout.fragment_calendar) {
    private val TAG="CalendarFragmentTAG"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListener()
    }
    private fun setListener(){

        binding.fgCalendarMain.setOnDateChangeListener(OnDateChangeListener { calendarView, i, i1, i2 ->
            var intent= Intent(requireActivity(),DietDetailsActivity::class.java)
            startActivity(intent)
        })
    }
}