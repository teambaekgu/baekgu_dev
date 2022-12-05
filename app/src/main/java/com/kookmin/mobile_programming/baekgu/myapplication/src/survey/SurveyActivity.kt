package com.kookmin.mobile_programming.baekgu.myapplication.src.survey

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.firebasepratice.Survey
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.*
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.MainActivity

class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

    var semail: String? = null
    var proteinAmout: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        semail = intent.getStringExtra("user_id")

        // 컴포넌트 변수에 담기
        val heightEdit = findViewById<EditText>(
            R.id.survey_edit_height
        )
        val weightEdit = findViewById<EditText>(R.id.survey_edit_weight)

        val proteinPurposeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_proteinpurpose)

        val trainingPurposeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainpurpose)

        val trainingCntRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainingcnt)


        val trainingTimeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainingtime)

        val dietCntBreakfast = findViewById<CheckBox>(R.id.survey_cb_dietcnt_breakfast)
        var dietCntLunch = findViewById<CheckBox>(R.id.survey_cb_dietcnt_lunch)
        var dietCntDinner = findViewById<CheckBox>(R.id.survey_cb_dietcnt_dinner);


        // 알러지
        var allergy1 = findViewById<CheckBox>(R.id.survey_cb_allergy_1)
        var allergy2 = findViewById<CheckBox>(R.id.survey_cb_allergy_2)
        var allergy3 = findViewById<CheckBox>(R.id.survey_cb_allergy_3)
        var allergy4 = findViewById<CheckBox>(R.id.survey_cb_allergy_4)
        var allergy5 = findViewById<CheckBox>(R.id.survey_cb_allergy_5)
        var allergy6 = findViewById<CheckBox>(R.id.survey_cb_allergy_6)
        var allergy7 = findViewById<CheckBox>(R.id.survey_cb_allergy_7)
        var allergy8 = findViewById<CheckBox>(R.id.survey_cb_allergy_8)
        var allergy9 = findViewById<CheckBox>(R.id.survey_cb_allergy_9)
        var allergy10 = findViewById<CheckBox>(R.id.survey_cb_allergy_10)
        var allergy11 = findViewById<CheckBox>(R.id.survey_cb_allergy_11)
        var allergy12 = findViewById<CheckBox>(R.id.survey_cb_allergy_12)
        var allergy13 = findViewById<CheckBox>(R.id.survey_cb_allergy_13)
        var allergy14 = findViewById<CheckBox>(R.id.survey_cb_allergy_14)
        var allergy15 = findViewById<CheckBox>(R.id.survey_cb_allergy_15)
        var allergy16 = findViewById<CheckBox>(R.id.survey_cb_allergy_16)
        var allergy17 = findViewById<CheckBox>(R.id.survey_cb_allergy_17)
        var allergy18 = findViewById<CheckBox>(R.id.survey_cb_allergy_18)
        var allergy19 = findViewById<CheckBox>(R.id.survey_cb_allergy_19)


        val snackynRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_snackyn)


        val proPre1 = findViewById<RadioGroup>(R.id.survey_rg_chickensausage)
        val proPre2 = findViewById<RadioGroup>(R.id.survey_rg_chickenball)
        val proPre3 = findViewById<RadioGroup>(R.id.survey_rg_saucechicken)
        val proPre4 = findViewById<RadioGroup>(R.id.survey_rg_beefsteak)
        val proPre5 = findViewById<RadioGroup>(R.id.survey_rg_godeungeo)
        val proPre6 = findViewById<RadioGroup>(R.id.survey_rg_chickensteak)
        val proPre7 = findViewById<RadioGroup>(R.id.survey_rg_protein)
        val proPre8 = findViewById<RadioGroup>(R.id.survey_rg_snack)


        val flaPre1 = findViewById<RadioGroup>(R.id.survey_rg_spicy)
        val flaPre2 = findViewById<RadioGroup>(R.id.survey_rg_very_spicy)
        val flaPre3 = findViewById<RadioGroup>(R.id.survey_rg_pepper)
        val flaPre4 = findViewById<RadioGroup>(R.id.survey_rg_garlic)
        val flaPre5 = findViewById<RadioGroup>(R.id.survey_rg_original)
        val flaPre6 = findViewById<RadioGroup>(R.id.survey_rg_soy)
        val flaPre7 = findViewById<RadioGroup>(R.id.survey_rg_cream)
        val flaPre8 = findViewById<RadioGroup>(R.id.survey_rg_vege)

        val addBtn = findViewById<Button>(R.id.survey_btn_save)

        var dao = DAOSurvey()

        addBtn.setOnClickListener {

            val sHeight = heightEdit.text.toString()
            val sWeight = weightEdit.text.toString()

            val proteinPurposeRadioButton =
                findViewById<RadioButton>(proteinPurposeRadioButtonGroup.checkedRadioButtonId)
            val sProteinPurpose = proteinPurposeRadioButton.text.toString()

            val trainingPurposeRadioButton =
                findViewById<RadioButton>(trainingPurposeRadioButtonGroup.checkedRadioButtonId)
            val sTrainingPurpose = trainingPurposeRadioButton.text.toString()

            val trainingCntRadioButton =
                findViewById<RadioButton>(trainingCntRadioButtonGroup.checkedRadioButtonId)
            val sTrainingCnt = trainingCntRadioButton.text.toString()

            val trainingTimeRadioButton =
                findViewById<RadioButton>(trainingTimeRadioButtonGroup.checkedRadioButtonId)
            val sTrainingTime = trainingTimeRadioButton.text.toString()

            val sDietCnt = sendCheck(dietCntBreakfast, dietCntLunch, dietCntDinner)
            val sAllergy = sendCheck(
                allergy1,
                allergy2,
                allergy3,
                allergy4,
                allergy5,
                allergy6,
                allergy7,
                allergy8,
                allergy9,
                allergy10,
                allergy11,
                allergy12,
                allergy13,
                allergy14,
                allergy15,
                allergy16,
                allergy17,
                allergy18,
                allergy19
            )

            val snackynRadioButton =
                findViewById<RadioButton>(snackynRadioButtonGroup.checkedRadioButtonId)
            val sSnackYn = snackynRadioButton.text.toString()

            val sPropre1 = findViewById<RadioButton>(proPre1.checkedRadioButtonId).text.toString()
            val sPropre2 = findViewById<RadioButton>(proPre2.checkedRadioButtonId).text.toString()
            val sPropre3 = findViewById<RadioButton>(proPre3.checkedRadioButtonId).text.toString()
            val sPropre4 = findViewById<RadioButton>(proPre4.checkedRadioButtonId).text.toString()
            val sPropre5 = findViewById<RadioButton>(proPre5.checkedRadioButtonId).text.toString()
            val sPropre6 = findViewById<RadioButton>(proPre6.checkedRadioButtonId).text.toString()
            val sPropre7 = findViewById<RadioButton>(proPre7.checkedRadioButtonId).text.toString()
            val sPropre8 = findViewById<RadioButton>(proPre8.checkedRadioButtonId).text.toString()
            val sPropreResult = sendRadio(
                sPropre1, sPropre2, sPropre3, sPropre4, sPropre5, sPropre6,
                sPropre7, sPropre8
            )

            val sFlapre1 = findViewById<RadioButton>(flaPre1.checkedRadioButtonId).text.toString()
            val sFlapre2 = findViewById<RadioButton>(flaPre2.checkedRadioButtonId).text.toString()
            val sFlapre3 = findViewById<RadioButton>(flaPre3.checkedRadioButtonId).text.toString()
            val sFlapre4 = findViewById<RadioButton>(flaPre4.checkedRadioButtonId).text.toString()
            val sFlapre5 = findViewById<RadioButton>(flaPre5.checkedRadioButtonId).text.toString()
            val sFlapre6 = findViewById<RadioButton>(flaPre6.checkedRadioButtonId).text.toString()
            val sFlapre7 = findViewById<RadioButton>(flaPre7.checkedRadioButtonId).text.toString()
            val sFlapre8 = findViewById<RadioButton>(flaPre8.checkedRadioButtonId).text.toString()
            val sFlapreResult = sendRadio(
                sFlapre1,
                sFlapre2,
                sFlapre3,
                sFlapre4,
                sFlapre5,
                sFlapre6,
                sFlapre7,
                sFlapre8
            )


            val survey = Survey(
                semail,
                sHeight,
                sWeight,
                sProteinPurpose,
                sTrainingPurpose,
                sTrainingCnt,
                sTrainingTime,
                sDietCnt,
                sAllergy,
                sSnackYn,
                sPropreResult,
                sFlapreResult
            )

            dao.add(survey).addOnSuccessListener(OnSuccessListener<Void?> {
                proteinAmout = calculateProtein(sHeight.toInt(), sWeight.toInt(), sTrainingPurpose)
                onClickShowAlert(proteinAmout!!,sFlapreResult.toTypedArray()!!,sPropreResult.toTypedArray()!!)

                // 입력창 초기화
                heightEdit.setText("")
                weightEdit.setText("")
                proteinPurposeRadioButton.isChecked = false
                trainingPurposeRadioButton.isChecked = false
                trainingCntRadioButton.isChecked = false
                trainingTimeRadioButton.isChecked = false


                setCheckBoxFalse(dietCntBreakfast, dietCntLunch, dietCntDinner)
                setCheckBoxFalse(
                    allergy1,
                    allergy2,
                    allergy3,
                    allergy4,
                    allergy5,
                    allergy6,
                    allergy7,
                    allergy8,
                    allergy9,
                    allergy10,
                    allergy11,
                    allergy12,
                    allergy13,
                    allergy14,
                    allergy15,
                    allergy16,
                    allergy17,
                    allergy18,
                    allergy19
                )

            }).addOnFailureListener(OnFailureListener {
                Toast.makeText(
                    applicationContext,
                    "실패",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }


    private fun sendCheck(vararg checkBox: CheckBox): List<String> {
        var checked = ""
        for (ch in checkBox) {
            if (ch.isChecked) {
                checked += ch.text.toString() + ","
            }
        }
        val hArr = checked.split(",").toTypedArray()
        val result = hArr.toList()
        return result.subList(0, result.size - 1)
    }

    private fun setCheckBoxFalse(vararg checkBox: CheckBox) {
        for (ch in checkBox) {
            if (ch.isChecked) {
                ch.isChecked = false
            }
        }
    }

    private fun sendRadio(vararg flapreStr: String): List<Int> {
        var flavor = mutableListOf<Int>()
        var i = 0
        for (str in flapreStr) {
            var x = 0
            when (str) {
                "매우나쁨" -> x = 1
                "나쁨" -> x = 2
                "보통" -> x = 3
                "좋음" -> x = 4
                "매우좋음" -> x = 5
            }
            flavor.add(x)
            i++
        }
        return flavor
    }

    private fun onClickShowAlert(p: Int, flavour: Array<Int>, product: Array<Int>) {
        val myAlertBuilder: AlertDialog.Builder = AlertDialog.Builder(this@SurveyActivity)
        myAlertBuilder.setTitle("회원님의 필수 단백질량은: ${proteinAmout.toString()}입니다")
        myAlertBuilder.setMessage("Ok버튼을 누르면 맞춤 식단을 만나보실 수 있습니다! /n 설문을 다시 작성하려면 Cancle버튼을 눌러주세요.")
        myAlertBuilder.setPositiveButton("Ok",
            DialogInterface.OnClickListener { dialog, which -> // OK 버튼을 눌렸을 경우
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("user_id", semail)
                intent.putExtra("proteinAmout", proteinAmout)
                intent.putExtra("flavour", flavour)
                intent.putExtra("product", product)
                startActivity(intent)
            })

        myAlertBuilder.setNegativeButton("Cancle",
            DialogInterface.OnClickListener { dialog, which -> // Cancle 버튼을 눌렸을 경우
                Toast.makeText(
                    applicationContext, "Pressed Cancle",
                    Toast.LENGTH_SHORT
                ).show()
            })
        myAlertBuilder.show()
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