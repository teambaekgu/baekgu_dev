package com.kookmin.mobile_programming.baekgu.myapplication.src.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityLoginBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.signup.SignupActivity

class LoginActivity:BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        setListener()
    }

    private fun setListener() {
        //로그인버튼
        binding.loginBtnLogin.setOnClickListener {
            if (binding.loginTvIdTitle.text.isNullOrEmpty() || binding.loginTvPwTitle.text.isNullOrEmpty()) {
                showCustomToast("정보를 올바르게 입력하세요")
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
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }

    private fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
//                    Log.d("로그인 성공")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("로그인 실패", task.exception)
                    Toast.makeText(baseContext, "로그인 실패", Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
    }

    private fun confirmLogin(id:String?,pw:String?){
        //firbase 로그인 확인 로직

    }

    private fun updateUI(user: FirebaseUser?) {

    }

    private fun reload() {

    }
}