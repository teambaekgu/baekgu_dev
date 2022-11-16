package com.kookmin.mobile_programming.baekgu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityMainBinding

// 액티비티 생성할 때 base activity를 상속해서 쓰고 <> () 안에를 바꿔줌.
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}