package com.kookmin.mobile_programming.baekgu.myapplication.src.survey

import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding

class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

<<<<<<< HEAD:app/src/main/java/com/kookmin/mobile_programming/baekgu/myapplication/src/survey/SurveyActivity.kt
=======
// 액티비티 생성할 때 base activity를 상속해서 쓰고 <> () 안에를 바꿔줌.
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
>>>>>>> 5029f22be256f1f40438462d20df982d4d2ff1df:app/src/main/java/com/kookmin/mobile_programming/baekgu/myapplication/MainActivity.kt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}