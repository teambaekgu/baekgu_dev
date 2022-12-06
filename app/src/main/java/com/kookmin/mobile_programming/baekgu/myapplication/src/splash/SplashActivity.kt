package com.kookmin.mobile_programming.baekgu.myapplication.src.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySplashBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.login.LoginActivity

class SplashActivity:BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },1500)
    }
}