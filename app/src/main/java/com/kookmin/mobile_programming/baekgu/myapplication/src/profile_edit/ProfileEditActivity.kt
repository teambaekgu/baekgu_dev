package com.kookmin.mobile_programming.baekgu.myapplication.src.profile_edit

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityProfileEditBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.signup.SignupActivity
import java.util.regex.Pattern

class ProfileEditActivity:BaseActivity<ActivityProfileEditBinding>(ActivityProfileEditBinding::inflate) {
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setListener()
    }

    // 프레퍼런스 수정 함수
    private fun updateUI(uid: String, newEmailValue: String, newPwValue: String,
                         newNameValue: String, newBirthValue: String,
                         newPhoneValue: String, newAddressValue: String
    ) {
        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("uid", uid)
        editor.putString("email", newEmailValue)
        editor.putString("password", newPwValue)
        editor.putString("name", newNameValue)
        editor.putString("birth", newBirthValue)
        editor.putString("phone", newPhoneValue)
        editor.putString("address", newAddressValue)
        editor.commit()

        // 파이어베이스 리얼타임 데이터베이스 수정
        updateUser(uid, newNameValue, newBirthValue, newPhoneValue, newAddressValue)
    }

    // 파이어베이스 리얼타임 데이터베이스 회원정보 수정 함수
    fun updateUser(email: String, name: String, birth: String, phone: String, address: String) {
        database = Firebase.database.reference
        val user = SignupActivity.User(name, birth, phone, address)

        database.child("users").child(email).setValue(user)

        Toast.makeText(baseContext, "개인 정보 수정 완료되었습니다.", Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun setListener(){
        // 프로필 수정 화면 생성 시 프레퍼런스에서 회원 정보 조회
        val sharedPreference = getSharedPreferences("userInfo", MODE_PRIVATE)
        val emailValue = sharedPreference.getString("email", "email")
        val pwValue = sharedPreference.getString("password", "password")
        val nameValue = sharedPreference.getString("name", "name")
        val birthValue = sharedPreference.getString("birth", "birth")
        val phoneValue = sharedPreference.getString("phone", "phone")
        val addressValue = sharedPreference.getString("address", "address")
        // 위 값으로 EditText에 표시
        binding.profileEditEditId.setText(emailValue)
        binding.profileEditEditPw.setText(pwValue)
        binding.profileEditEditName.setText(nameValue)
        binding.profileEditEditBirthday.setText(birthValue)
        binding.profileEditEditNumber.setText(phoneValue)
        binding.profileEditEditTown.setText(addressValue)

        // 뒤로가기 버튼
        binding.profileEditImgBack.setOnClickListener {
            finish()
        }

        // 완료 버튼
        binding.profileEditTvFinish.setOnClickListener {
            val user = Firebase.auth.currentUser!!
            var newEmailValue = binding.profileEditEditId.text.toString()
            var newPwValue = binding.profileEditEditPw.text.toString()
            var newNameValue = binding.profileEditEditName.text.toString()
            var newBirthValue = binding.profileEditEditBirthday.text.toString()
            var newPhoneValue = binding.profileEditEditNumber.text.toString()
            var newAddressValue = binding.profileEditEditTown.text.toString()

            if (Pattern.matches(
                    "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[\$@\$!%*#?&])[A-Za-z[0-9]\$@\$!%*#?&]{8,20}\$", newPwValue)) {
                if(newNameValue.isNotEmpty() && newBirthValue.isNotEmpty() && newPhoneValue.isNotEmpty() && newAddressValue.isNotEmpty()) {
                    // 회원 정보 수정
                    user?.let {
                        val uid = user.uid

                        // 원래 비밀번호랑 다르면 비밀번호 수정
                        if(pwValue != newPwValue) {
                            // 파이어베이스 사용자 재인증 - 이메일, 비밀번호 수정 전 한번 해줘야함
                            val credential = EmailAuthProvider.getCredential(emailValue.toString(), pwValue.toString())
                            user.reauthenticate(credential).addOnCompleteListener {
                                Log.d("회원정보 수정", "유저 재인증 완료")
                            }

                            // 파이어베이스 탑재 비밀번호 수정 메소드
                            user!!.updatePassword(binding.profileEditEditPw.text.toString())
                                .addOnCompleteListener { task ->
                                    if (task.isSuccessful) {
                                        Log.d("비밀번호 수정", "비밀번호 변경 완료")
                                    }
                                }
                        }

                        // 나머지 회원정보, 비밀번호 프레퍼런스 수정
                        updateUI(uid, newEmailValue, newPwValue, newNameValue, newBirthValue, newPhoneValue, newAddressValue)
                    }
                } else {
                    Toast.makeText(baseContext, "모든 항목을 다 입력해주세요.", Toast.LENGTH_SHORT).show()

                }
            } else {
                Toast.makeText(baseContext, "8~16자 영문, 숫자, 특수문자를 사용하세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}