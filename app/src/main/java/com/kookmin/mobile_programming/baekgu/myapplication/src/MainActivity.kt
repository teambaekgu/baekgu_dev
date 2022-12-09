package com.kookmin.mobile_programming.baekgu.myapplication.src

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityMainBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.dto.DietInfo
import com.kookmin.mobile_programming.baekgu.myapplication.src.dto.LocalDB
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_calendar.CalendarFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.ProductFragment
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_profile.ProfileFragment
import java.util.*


class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private var productFragment: Fragment?=null
    private var calendarFragment: Fragment?=null
    private var profileFragment: Fragment?=null
    private var firebaseDatabase: FirebaseDatabase? = null
    private var databaseReference: DatabaseReference? = null
    private lateinit var auth: FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        val test="weagaweg"

        val proteinAmount = intent.getIntExtra("proteinAmount", 85)
        val flavour = intent.getIntArrayExtra("flavour")
        val product = intent.getIntArrayExtra("product")
        val allergy = 3


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase!!.getReference().child("Survey")
        Log.d("p", proteinAmount.toString())
        Log.d("flavour", flavour.toString())
        Log.d("product", product.toString())

        //캘린더 상품 , 식단 상세보기 , 회원정보 수정 테두리 , README 작성



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
    private fun getValue(email: String) {
        databaseReference!!.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (dataSnapshot in snapshot.children) {
                    if (dataSnapshot.child("user_id").getValue(String::class.java) == email) {
                        val sFHeight =
                            dataSnapshot.child("user_height").getValue(String::class.java)
                        val sFWeight =
                            dataSnapshot.child("user_weight").getValue(String::class.java)
                        val sFProteinPurpose =
                            dataSnapshot.child("user_proteinPurpose").getValue(String::class.java)
                        val sFSnackYn =
                            dataSnapshot.child("user_snackYn").getValue(String::class.java)
                        val sFTrainingCnt =
                            dataSnapshot.child("user_trainingCnt").getValue(String::class.java)
                        val sFTrainingPurpose =
                            dataSnapshot.child("user_trainingPurpose").getValue(String::class.java)
                        val sFTrainingTime =
                            dataSnapshot.child("user_trainingTime").getValue(String::class.java)

                        val sFAllergy =
                            dataSnapshot.child("user_allergy").value as ArrayList<Int>?
                        val sFDietCnt =
                            dataSnapshot.child("user_dietCnt").value as ArrayList<Int>?
                        val sFPropre = dataSnapshot.child("user_proPre").value as ArrayList<Int>?
                        val sFFlapre = dataSnapshot.child("user_flaPre").value as ArrayList<Int>?



                        //Log.d("아이디", semail!!)
                        Log.d("1. 키", sFHeight!!)
                        Log.d("2. 무게", sFWeight!!)
                        Log.d("3. 단백질 섭취 목적", sFProteinPurpose!!)
                        Log.d("4. 간식 여부", sFSnackYn!!)
                        Log.d("5. 훈련 횟수", sFTrainingCnt!!)
                        Log.d("6. 훈련 목적", sFTrainingPurpose!!)
                        Log.d("7. 훈련 시간", sFTrainingTime!!)

                        Log.d("8. 알러지", sFAllergy.toString())
                        Log.d("9. 하루 식단", sFDietCnt.toString())
                        Log.d("10. 제품별 선호도", sFPropre.toString())
                        Log.d("11. 맛 선호도", sFFlapre.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {}
        })
    }



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

    fun makeDietCalendar(proteinAmount: Int, flavour: IntArray?, product: Array<Int>, allergy: Int, month: Int) : DietInfo {

        // 1. 받아온 달에 맞춰 필요한 총 상품 갯수 산출
        val case1 = arrayOf(1,3,4,7,8,10,12)
        val case2 = arrayOf(4,6,9,11)
        var totalAmount = 28 * 3
        if(case1.contains(month)) totalAmount = 31 * 3
        else if(case2.contains(month)) totalAmount = 30 * 3

        // 2. 알러지를 제외한 상품 리스트 생성
        val finalProduct = arrayListOf<Int>()
        var sum = 0         // 제품 선호 비율에 따라 식단을 구성하기 위한 변수
        var sumCheck = 0    // 비율별로 구성하고 모자란 제품을 채워주기 위한 변수

        for(i : Int in 0 until product.size){
            if(i != allergy) {
                sum += product[i]
                finalProduct.add(product[i])
            }
            else if(i == allergy){
                finalProduct.add(0)
            }
        }
        Log.d("FINAL PRODUCT CHECK :: ", finalProduct.toString())

        // 3. 제품 선호 비율에 맞게 한달치 제품을 배정하고 모자란 부분은 제일 선호가 높았던 제품으로 채워줌
        var max = finalProduct[0]
        var idx = 0
        for(i : Int in 0 until finalProduct.size){
            if(finalProduct[i] > max) {
                max = finalProduct[i]
                idx = i
            }
            val value = ( totalAmount / sum * finalProduct[i]) / 1
            sumCheck += value
            finalProduct[i] = value // finalProduct 배열을 선호 수치에 따라 한달치 상품 갯수 비율에 맞게 수정
        }
        // ex) finalProduct = [10, 15, 20, 20, 0, 25+3]
        if(totalAmount - sumCheck > 0) finalProduct[idx] += (totalAmount - sumCheck) // 한달치 식단을 짜고 모자란 갯수는 제일 선호도가 높은 제품으로 채워줌

        // 4. 하루 필요 단백질양을 고려하여 식단 산출
        // dietInfo에 30일치 식단 넣어서 보내줄거임.
        var dietInfo = DietInfo()
        var localDb = LocalDB()
        var dietList = arrayListOf<String>()

        for(i : Int in 0 until finalProduct.size) {

            if (finalProduct[i] == 0) continue  // 알러지 상품은 제외
            val random = Random()

            for(j : Int in 0..finalProduct[i]){
                dietList.add(localDb.product[i][random.nextInt(localDb.product[i].size)].toString())
            }
        }
        dietList.shuffle() // 구성된 제품을 랜점하게 셔플

        for(i : Int in 0 until (totalAmount/3)){
            dietInfo.calendar[i][0] = dietList.get(3*i)
            dietInfo.calendar[i][1] = dietList.get(3*i+1)
            dietInfo.calendar[i][2] = dietList.get(3*i+2)
        }

        // 단백질 양이 부족하면 채워줌
        if (70 < proteinAmount - 20){
            for(i : Int in 0 until (totalAmount/3)){
                dietInfo.calendar[i][3] = localDb.protein[i%10]
            }
            if (91 < proteinAmount - 20){
                for(i : Int in 0 until (totalAmount/3)){
                    dietInfo.calendar[i][4] = localDb.appetizer[i%5]
                }
            }
        }

        return dietInfo
    }

}