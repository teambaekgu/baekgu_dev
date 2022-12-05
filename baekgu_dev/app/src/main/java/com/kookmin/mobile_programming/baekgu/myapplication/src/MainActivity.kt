package com.kookmin.mobile_programming.baekgu.myapplication.src

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityMainBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_calendar.CalendarFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.ProductFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile.ProfileFragment


class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {


//    var firebaseDatabase: FirebaseDatabase? = null
//    var databaseReference: DatabaseReference? = null
//
//    var proteinAmout: Int?= null
//    var sAllergy: ArrayList<String>? = null
//    var sPropre: ArrayList<Int>? = null
//    var sFlapre: ArrayList<Int>? = null
//    var semail: String? = null


    private var productFragment: Fragment?=null
    private var calendarFragment: Fragment?=null
    private var profileFragment: Fragment?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val user = Firebase.auth.currentUser
//        user?.let {
//            semail = user.email
//        }
//
//        Log.d("_________________________________", "==================")
//        Log.d("semail",semail.toString())
//        Log.d("_________________________________", "==================")

//        // 데이터베이스 초기화
//        firebaseDatabase = FirebaseDatabase.getInstance();
//        // 레퍼런스 초기화
//        databaseReference = firebaseDatabase!!.getReference().child("Survey");

        //getValue()

        val test="weagaweg"

        productFragment= ProductFragment()
        supportFragmentManager.beginTransaction().replace(R.id.main_layout_fragment,productFragment!!).commit()
        binding.mainBnv.setOnItemSelectedListener{
            when(it.itemId){
                R.id.main_product ->{


                    moveProduct()
                }

                R.id.main_calender ->{

                    moveCalendar()
                }

                R.id.main_profile ->{
                    moveProfile()
                }


            }

            return@setOnItemSelectedListener true
        }
    }

//    private fun getValue() {
//        databaseReference!!.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                for (dataSnapshot in snapshot.children) {
//                    Log.d("===================",
//                        dataSnapshot.child("user_id").getValue(String::class.java).toString()
//                    )
//                    if(dataSnapshot.child("user_id").getValue(String::class.java) == semail){
//                        val sFHeight = dataSnapshot.child("user_height").getValue(String::class.java)
//                        val sFWeight = dataSnapshot.child("user_weight").getValue(String::class.java)
//                        val sFTrainingPurpose =
//                            dataSnapshot.child("user_trainingPurpose").getValue(String::class.java)
//
//                        proteinAmout = calculateProtein(sFHeight!!.toInt(), sFWeight!!.toInt(),
//                            sFTrainingPurpose!!
//                        )
//
//                        val sFAllergy = dataSnapshot.child("user_allergy").value as ArrayList<String>?
//                        val sFPropre = dataSnapshot.child("user_proPre").value as ArrayList<Int>?
//                        val sFFlapre = dataSnapshot.child("user_flaPre").value as ArrayList<Int>?
//
//
//                        sAllergy = sFAllergy
//                        sPropre = sFPropre // 이것만 바꿔서 사용하시면 됩니다!
//                        sFlapre = sFFlapre
//
//                        Log.d("id", semail.toString())
//                        Log.d("필요단백질", proteinAmout.toString())
//                        Log.d("8. 알러지", sAllergy.toString())
//                        Log.d("10. 제품별 선호도", sPropre.toString())
//                        Log.d("11. 맛 선호도", sFlapre.toString())
//                    } else {
//                        Log.d("nothing", "nothing")
//                    }
//
//                }
//                //listView!!.adapter = adapter
//            }
//
//            override fun onCancelled(error: DatabaseError) {}
//        })
//    }




    private fun moveProduct(){

        if (productFragment != null) supportFragmentManager.beginTransaction().show(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().hide(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().hide(profileFragment!!).commit()
    }

    private fun moveCalendar(){

        if(calendarFragment==null){
            calendarFragment=CalendarFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_layout_fragment,calendarFragment!!).commit()
        }



        if (productFragment != null) supportFragmentManager.beginTransaction().hide(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().show(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().hide(profileFragment!!).commit()
    }

    private fun moveProfile(){

        if(profileFragment==null){
            profileFragment= ProfileFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_layout_fragment,profileFragment!!).commit()
        }

        if (productFragment != null) supportFragmentManager.beginTransaction().hide(productFragment!!).commit()
        if (calendarFragment != null) supportFragmentManager.beginTransaction().hide(calendarFragment!!).commit()
        if (profileFragment != null) supportFragmentManager.beginTransaction().show(profileFragment!!).commit()
    }


    private fun calculateProtein(height: Int, weight: Int, purpose: String) : Int{
        val leanFat: Int = ((1.10 * weight) - 128 * (weight / height)).toInt()
        val result:Int = when (purpose) {
            "보디빌딩 대회 준비" -> (leanFat * 2.0).toInt()
            "바디 프로필 준비" -> (leanFat * 1.8).toInt()
            "골격근량 증가" -> (leanFat * 1.5).toInt()
            "체지방 감량" -> (leanFat * 1.3).toInt()
            "벌크업" -> (leanFat * 1.75).toInt()
            "웨이트 트레이닝을 하지 않음" -> (leanFat * 1.1).toInt()
            else -> 0
        }
        return result
    }
}