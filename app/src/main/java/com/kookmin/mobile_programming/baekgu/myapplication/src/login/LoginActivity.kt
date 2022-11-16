package com.kookmin.mobile_programming.baekgu.myapplication.src.login

import android.content.Intent
import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityLoginBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.signup.SignupActivity

class LoginActivity:BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()

    }


    private fun setListener(){

        //로그인버튼
        binding.loginBtnLogin.setOnClickListener {
            if(binding.loginTvIdTitle.text.isNullOrEmpty() || binding.loginTvPwTitle.text.isNullOrEmpty()){
                showCustomToast("정보를 올바르게 입력하세요")
            }else{
                confirmLogin(binding.loginTvIdTitle.text.toString(),binding.loginTvPwTitle.toString())

            }
        }


        
        //회원가입 버튼
        binding.loginTvSignup.setOnClickListener {
            var intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

    }

    private fun confirmLogin(id:String?,pw:String?){
        //firbase 로그인 확인 로직

    }
}