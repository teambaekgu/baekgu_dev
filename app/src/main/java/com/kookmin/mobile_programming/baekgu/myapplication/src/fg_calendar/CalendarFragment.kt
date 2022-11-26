package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_calendar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CalendarView.OnDateChangeListener
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentCalendarBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.DietDetailsActivity
import java.text.SimpleDateFormat
import java.util.*


class CalendarFragment: BaseFragment<FragmentCalendarBinding>(FragmentCalendarBinding::bind, R.layout.fragment_calendar) {
    private val TAG="CalendarFragmentTAG"

    private var month:String=""
    private var day:String=""


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val now = System.currentTimeMillis()
        val date = Date(now)

        var sdf = SimpleDateFormat("MM.dd")

        val getTime: String = sdf.format(date)

        Log.d("weagawegawegwaeg",getTime)

        binding.fgCalendarTvDate.text=getTime
        setListener()
    }
    private fun setListener(){


        binding.fgCalendarTvMore.setOnClickListener {

            var intent=Intent(requireContext(),DietDetailsActivity::class.java)

            intent.putExtra("date","${month}.${day}")
            startActivity(intent)


        }


        binding.fgCalendarMain.setOnDateChangeListener(OnDateChangeListener { calendarView, i, i1, i2 ->

            binding.fgCalendarTvDate.text="${i1+1}.${i2}"


        })

    }
}