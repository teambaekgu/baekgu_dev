package com.kookmin.mobile_programming.baekgu.myapplication.src.signup

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySignupBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.survey.SurveyActivity
import java.util.regex.Pattern

class SignupActivity:BaseActivity<ActivitySignupBinding>(ActivitySignupBinding::inflate) {
    private lateinit var emailValue: String
    private lateinit var pwValue: String
    private lateinit var nameValue: String
    private lateinit var birthValue: String
    private lateinit var phoneValue: String
    private lateinit var addressValue: String
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setListener()

    }

    // 프레퍼런스 업데이트 함수
    private fun updateUI(uid: String?, email: String?, pwValue: String?, nameValue: String?, birthValue: String?, phoneValue: String?, addressValue: String?) {
        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("uid", uid)
        editor.putString("email", email)
        editor.putString("password", pwValue)
        editor.putString("name", nameValue)
        editor.putString("birth", birthValue)
        editor.putString("phone", phoneValue)
        editor.putString("address", addressValue)
        editor.commit()
    }

    // 파이어베이스 Realtime Database 저장 형식
    @IgnoreExtraProperties
    data class User(val name: String, val birth: String, val phone: String, val address: String) {
        // Null default values create a no-argument default constructor, which is needed
        // for deserialization from a DataSnapshot.
    }

    // 파이어베이스 Realtime Database 저장 함수
    fun writeNewUser(email: String, name: String, birth: String, phone: String, address: String) {
        database = Firebase.database.reference
        val user = User(name, birth, phone, address)

        database.child("users").child(email).setValue(user)
    }

    // 회원가입 함수
    private fun createAccount(email: String, password: String) {
        // 파이어베이스 회원가입 메서드
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // 회원가입 성공
                    val user = Firebase.auth.currentUser
                    user?.let {
                        val email = user.email
                        val uid = user.uid
                        // 프레퍼런스에 유저 정보 저장
                        updateUI(uid, email, pwValue, nameValue, birthValue, phoneValue, addressValue)

                        // 파이어베이스 Realtime Database 데이터 저장
                        writeNewUser(uid, nameValue, birthValue, phoneValue, addressValue)

                        // 설문조사 페이지로 이동
                        var intent= Intent(this, SurveyActivity::class.java)
                        startActivity(intent)
                    }
                } else {
                    // 회원가입 실패 시 프레퍼런스 null 값으로 업데이트
                    Toast.makeText(baseContext, "이미 존재하는 이메일입니다.", Toast.LENGTH_SHORT).show()
                    updateUI(null, null, null, null, null, null, null)
                }
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

    private fun setListener(){
        // 뒤로가기 버튼
        binding.signupImgBack.setOnClickListener {
            finish()
        }

        auth = Firebase.auth
        // 회원가입 완료 버튼
        binding.signupTvFinish.setOnClickListener() {
            emailValue = binding.signupEditId.text.toString()
            pwValue = binding.signupEditPw.text.toString()
            nameValue = binding.signupEditName.text.toString()
            birthValue = binding.signupEditBirthday.text.toString()
            phoneValue = binding.signupEditNumber.text.toString()
            addressValue = binding.signupEditTown.text.toString()
            // 이메일 형식 확인
            if(android.util.Patterns.EMAIL_ADDRESS.matcher(emailValue).matches()) {
                // 비밀번호 형식 확인
                if (Pattern.matches(
                        "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[\$@\$!%*#?&])[A-Za-z[0-9]\$@\$!%*#?&]{8,20}\$", pwValue)) {
                    // 나머지 값 빈 칸이 있는지 확인
                    if(nameValue.isNotEmpty() && birthValue.isNotEmpty() && phoneValue.isNotEmpty() && addressValue.isNotEmpty()) {
                        // 파이어베이스 Authentication 계정 생성
                        createAccount(
                            binding.signupEditId.text.toString(),
                            binding.signupEditPw.text.toString()
                        )
                    } else {
                        Toast.makeText(baseContext, "모든 항목을 다 입력해주세요.", Toast.LENGTH_SHORT).show()

                    }
                } else {
                    Toast.makeText(baseContext, "8~16자 영문, 숫자, 특수문자를 사용하세요.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(baseContext, "이메일 형식이 아닙니다.", Toast.LENGTH_SHORT).show()
            }
        }

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
    }
}