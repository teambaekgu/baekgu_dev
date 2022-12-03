package com.kookmin.mobile_programming.baekgu.myapplication.src.signup

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySignupBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.survey.SurveyActivity


class SignupActivity:BaseActivity<ActivitySignupBinding>(ActivitySignupBinding::inflate) {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        // 회원가입 완료 버튼
        binding.signupTvFinish.setOnClickListener() {
            //[Temp] : 발표자료에 쓰일 예정이므로 해당코드는 잠시 주석처리
//            createAccount(
//                binding.signupEditId.text.toString(),
//                binding.signupEditPw.text.toString()
//            )
//            Log.d(TAG, "버튼 클릭")
            startActivity(Intent(this, SurveyActivity::class.java))
        }


        setListener()

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


    private fun setListener(){


        binding.signupEditId.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditId.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditId.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()

        }

        binding.signupEditPw.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditPw.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditPw.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }

        binding.signupEditName.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditName.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditName.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }

        binding.signupEditTown.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditTown.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditTown.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }

        binding.signupEditBirthday.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditBirthday.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditBirthday.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }

        binding.signupEditNumber.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.signupEditNumber.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.signupEditNumber.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }


        binding.signupImgBack.setOnClickListener {
            finish()
        }



    }

    //정보가 올바르게 입력되었는지 확인
    private fun checkData(){
        if(binding.signupEditId.text!!.isNotEmpty() && binding.signupEditPw.text!!.isNotEmpty() && binding.signupEditName.text!!.isNotEmpty() &&
            binding.signupEditTown.text!!.isNotEmpty() && binding.signupEditNumber.text!!.isNotEmpty() && binding.signupEditBirthday.text!!.isNotEmpty()){
            binding.signupTvFinish.background=resources.getDrawable(R.drawable.bg_btn_activity,null)
            binding.signupTvFinish.setTextColor(resources.getColor(R.color.white,null))

        }else{
            binding.signupTvFinish.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            binding.signupTvFinish.setTextColor(resources.getColor(R.color.subGrey,null))

        }
    }

    private fun updateUI(user: FirebaseUser?) {

    }

    companion object {
        private const val TAG = "EmailPassword"
    }
}