package com.kookmin.mobile_programming.baekgu.myapplication.src.signup

import android.content.Intent
import android.os.Bundle
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySignupBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity

class SignupActivity:BaseActivity<ActivitySignupBinding>(ActivitySignupBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()
    }

    
    private fun setListener(){
        binding.signupTvFinish.setOnClickListener { 
            if(checkData()){
                signupFirebase(binding.signupEditId.text.toString(),binding.signupEditPw.text.toString(),binding.signupEditName.text.toString())

            }
        }        
    }

    
    

    //정보가 올바르게 입력되었는지 확인
    private fun checkData():Boolean{
        if(true){
            return true
        }else{
            return false
        }
    }
    
    private fun signupFirebase(id:String?,pw:String?,name:String?){
        //firbase 로직




        //회원가입 성공할 경우 메인화면으로 이동하는 코드
//        var intent= Intent(this,MainActivity::class.java)
//        startActivity(intent)
    }
}