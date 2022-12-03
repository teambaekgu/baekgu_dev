package com.kookmin.mobile_programming.baekgu.myapplication.src

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityMainBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_calendar.CalendarFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.ProductFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile.ProfileFragment


class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private var productFragment: Fragment?=null
    private var calendarFragment: Fragment?=null
    private var profileFragment: Fragment?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val test="weagaweg"

        productFragment= ProductFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_layout_fragment,productFragment!!).commit()
        binding.mainBnv.setOnItemSelectedListener{
            when(it.itemId){
                R.id.main_product ->{


                    moveProduct()
                }

                R.id.main_calender ->{

                    moveCalendar()
                }

                R.id.main_profile ->{
                    moveProfile()
                }


            }

            return@setOnItemSelectedListener true
        }
    }




    private fun moveProduct(){

        if (productFragment != null) supportFragmentManager.beginTransaction().show(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().hide(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().hide(profileFragment!!).commit()
    }

    private fun moveCalendar(){

        if(calendarFragment==null){
            calendarFragment=CalendarFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_layout_fragment,calendarFragment!!).commit()
        }



        if (productFragment != null) supportFragmentManager.beginTransaction().hide(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().show(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().hide(profileFragment!!).commit()
    }

    private fun moveProfile(){

        if(profileFragment==null){
            profileFragment= ProfileFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_layout_fragment,profileFragment!!).commit()
        }

        if (productFragment != null) supportFragmentManager.beginTransaction().hide(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().hide(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().show(profileFragment!!).commit()
    }



}