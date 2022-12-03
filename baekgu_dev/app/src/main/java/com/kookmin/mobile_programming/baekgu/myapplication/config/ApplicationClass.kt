package com.kookmin.mobile_programming.baekgu.myapplication.config

import android.app.Application
import android.content.SharedPreferences
import android.util.Log

class ApplicationClass: Application() {

    // 코틀린의 전역변수 문법
    companion object {
        // 만들어져있는 SharedPreferences 를 사용해야합니다. 재생성하지 않도록 유념해주세요
        lateinit var sharedPreferences: SharedPreferences




    }

    // 앱이 처음 생성되는 순간, SP를 새로 만들어주고, 레트로핏 인스턴스를 생성합니다.
    override fun onCreate() {
        super.onCreate()

        sharedPreferences =
            applicationContext.getSharedPreferences("INFO", MODE_PRIVATE)
        Log.d("awegweagwgwea","hello")




    }
}