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

    private fun setListener() {
        //로그인버튼
        binding.loginBtnLogin.setOnClickListener {
            if (binding.loginTvIdTitle.text.isNullOrEmpty() || binding.loginTvPwTitle.text.isNullOrEmpty()) {
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
                    startActivity(Intent(this,MainActivity::class.java))
                    val user = auth.currentUser
                    user?.let {
                        val uid = user.uid
                        val email = user.email
                        updateUI("uid", uid)
                        updateUI("email", email)

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
//                            val jsonObject = JSONTokener(it.value.toString()).nextValue() as JSONObject
//                            val nameValue = jsonObject.getString("name")
//                            val birthValue = jsonObject.getString("birth")
//                            val phoneValue = jsonObject.getString("phone")
//                            val addressValue = jsonObject.getString("address")

                    }
                } else {
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

    private fun reload() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

//    private fun updateUI(uid: String?, email: String?, pwValue: String?, nameValue: String?,
//                         birthValue: String?, phoneValue: String?, addressValue: String?) {
//        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
//        val editor: SharedPreferences.Editor = sharedPreference.edit()
//        editor.putString("uid", uid)
//        editor.putString("email", email)
//        editor.putString("password", pwValue)
//        editor.putString("name", nameValue)
//        editor.putString("birth", birthValue)
//        editor.putString("phone", phoneValue)
//        editor.putString("address", addressValue)
//        editor.commit()
//    }
    private fun updateUI(title: String?, value: String?) {
        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(title, value)
        editor.commit()
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




}