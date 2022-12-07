package com.kookmin.mobile_programming.baekgu.myapplication.src.login

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityLoginBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity
import com.kookmin.mobile_programming.baekgu.myapplication.src.signup.SignupActivity

class LoginActivity:BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    private lateinit var auth: FirebaseAuth
        private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        setListener()
    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }

    // 로그인 기록이 있으면 메인 액티비티로 이동
    private fun reload() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun checkData(){
        if(binding.loginEditId.text!!.isNotEmpty() && binding.loginEditPw.text!!.isNotEmpty()){
            binding.loginBtnLogin.background=resources.getDrawable(R.drawable.bg_btn_activity,null)
            binding.loginBtnLogin.setTextColor(resources.getColor(R.color.white,null))

        }else{
            binding.loginBtnLogin.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            binding.loginBtnLogin.setTextColor(resources.getColor(R.color.subGrey,null))

        }
    }

    // 프레퍼런스 값 업데이트 함수
    private fun updateUI(title: String?, value: String?) {
        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(title, value)
        editor.commit()
    }

    // 로그인 함수
    private fun signIn(email: String, password: String) {
        // 파이어베이스 로그인 메서드
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // 로그인 성공하면 메인화면으로 화면 전환
                    intent = Intent(this,MainActivity::class.java)
                    intent.putExtra("user_id",binding.loginEditId.text.toString())
                    startActivity(intent)
                    val user = auth.currentUser

                    // 파이어베이스 Realtime Database 조회 후 그 정보로 프레퍼런스 업데이트
                    user?.let {
                        val uid = user.uid
                        val email = user.email
                        updateUI("uid", uid)
                        updateUI("email", email)
                        updateUI("password", binding.loginEditPw.text.toString())

                        database = Firebase.database.reference
                        database.child("users").child(uid).child("name").get().addOnSuccessListener {
                            var nameValue = it.value.toString()
                            updateUI("name", nameValue)
                        }
                        database.child("users").child(uid).child("birth").get().addOnSuccessListener {
                            var birthValue = it.value.toString()
                            updateUI("birth", birthValue)
                        }
                        database.child("users").child(uid).child("phone").get().addOnSuccessListener {
                            var phoneValue = it.value.toString()
                            updateUI("phone", phoneValue)
                        }
                        database.child("users").child(uid).child("address").get().addOnSuccessListener {
                            var addressValue = it.value.toString()
                            updateUI("address", addressValue)
                        }
                    }
                } else {
                    // 로그인 실패 시 프레퍼런스 null 값으로 업데이트
                    Toast.makeText(baseContext, "이메일 또는 비밀번호를 잘못 입력했습니다.", Toast.LENGTH_SHORT).show()
                    updateUI("uid", null)
                    updateUI("email", null)
                    updateUI("password", null)
                    updateUI("name", null)
                    updateUI("birth", null)
                    updateUI("phone", null)
                    updateUI("address", null)
                }
            }
    }

    private fun setListener() {
        //로그인버튼
        binding.loginBtnLogin.setOnClickListener {
            if (binding.loginEditId.text.isNullOrEmpty() || binding.loginEditPw.text.isNullOrEmpty()) {
                showCustomToast("이메일, 비밀번호를 입력하세요.")
            } else {
                signIn(
                    binding.loginEditId.text.toString(),
                    binding.loginEditPw.text.toString()
                )
            }
        }

        //회원가입 버튼
        binding.loginTvSignup.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        binding.loginEditId.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.loginEditId.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.loginEditId.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }

        binding.loginEditPw.addTextChangedListener {
            if(it!!.isNotEmpty()){
                binding.loginEditPw.background=resources.getDrawable(R.drawable.bg_activity,null)
            }else{
                binding.loginEditPw.background=resources.getDrawable(R.drawable.bg_btn_disabled,null)
            }
            checkData()
        }
    }
}