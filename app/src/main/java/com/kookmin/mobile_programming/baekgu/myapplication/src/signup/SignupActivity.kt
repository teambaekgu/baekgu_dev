package com.kookmin.mobile_programming.baekgu.myapplication.src.signup

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySignupBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity


class SignupActivity:BaseActivity<ActivitySignupBinding>(ActivitySignupBinding::inflate) {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth

        // 회원가입 완료 버튼
        binding.signupTvFinish.setOnClickListener() {
            createAccount(
                binding.signupEditId.text.toString(),
                binding.signupEditPw.text.toString()
            )
            Log.d(TAG, "버튼 클릭")
        }

    }

    private fun createAccount(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "회원가입 성공")
                    var intent= Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    Log.w(TAG, "회원가입 실패", task.exception)
                    Toast.makeText(baseContext, "이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
    }

//
//    private fun setListener(){
//        binding.signupTvFinish.setOnClickListener {
//            if(checkData()){
//                signupFirebase(
//                    binding.signupEditId.text.toString(),
//                    binding.signupEditPw.text.toString(),
//                    binding.signupEditName.text.toString()
//                )
//            }
//        }
//    }
//
//    //정보가 올바르게 입력되었는지 확인
//    private fun checkData():Boolean{
//        if(true){
//
//            return true
//        }else{
//            return false
//        }
//    }

    private fun updateUI(user: FirebaseUser?) {

    }

    companion object {
        private const val TAG = "EmailPassword"
    }
}