package com.kookmin.mobile_programming.baekgu.myapplication.src.survey

import android.R
import android.os.Bundle
import android.widget.*
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding


class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)

        // 컴포넌트 변수에 담기

        // 컴포넌트 변수에 담기
        val heightEdit = findViewById<EditText>(R.id.survey_edit_height)
        val weightEdit = findViewById<EditText>(R.id.survey_edit_weight)

        val proteinPurposeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_proteinpurpose)
        val proteinPurposeRadioButton = findViewById<RadioButton>(proteinPurposeRadioButtonGroup.checkedRadioButtonId)

        val trainingPurposeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainpurpose)
        val trainingPurposeRadioButton = findViewById<RadioButton>(trainingPurposeRadioButtonGroup.checkedRadioButtonId)

        val trainingCntRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainingcnt)
        val trainingCntRadioButton = findViewById<RadioButton>(trainingCntRadioButtonGroup.checkedRadioButtonId)

        val trainingTimeRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_trainingtime)
        val trainingTimeRadioButton = findViewById<RadioButton>(trainingTimeRadioButtonGroup.checkedRadioButtonId)

        //https://wpioneer.tistory.com/23 -> checkbox 텍스트 처리
        // 체크박스 part
        //val dietCntEdit = findViewById<EditText>(R.id.dietCnt)
        //val allergyEdit = findViewById<EditText>(com.kookmin.mobile_programming.baekgu.myapplication.R.id.allergy)
        val dietCntBreakfast = findViewById<CheckBox>(R.id.survey_cb_dietcnt_breakfast)
        var dietCntLunch = findViewById<CheckBox>(R.id.survey_cb_dietcnt_lunch)
        var dietCntDinner = findViewById<CheckBox>(R.id.survey_cb_dietcnt_dinner);


        val snackynRadioButtonGroup = findViewById<RadioGroup>(R.id.survey_rg_snackyn)
        val snackynRadioButton = findViewById<RadioButton>(snackynRadioButtonGroup.checkedRadioButtonId)

        // 체크박스 part
        // val proPreEdit = findViewById<EditText>(id.proPre)

        val addBtn = findViewById<Button>(R.id.survey_btn_save)

        // val dao = DAOSurvey()
        // listView = findViewById(R.id.list_View);

        // 어뎁터 초기화
        // adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);

        // 데이터베이스 초기화
        // firebaseDatabase = FirebaseDatabase.getInstance();

        // 레퍼런스 초기화
        // databaseReference = firebaseDatabase.getReference().child("Data");

        // 데이터 조회
        //getValue();

        // 데이터 등록
        // listView = findViewById(R.id.list_View);

        // 어뎁터 초기화
        // adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);

        // 데이터베이스 초기화
        // firebaseDatabase = FirebaseDatabase.getInstance();

        // 레퍼런스 초기화
        // databaseReference = firebaseDatabase.getReference().child("Data");

        // 데이터 조회
        //getValue();

        // 데이터 등록
        addBtn.setOnClickListener {

            // 입력값 변수에 담기
            val sHeight = heightEdit.text.toString()
            val sWeight = weightEdit.text.toString()
            val sProteinPurpose = proteinPurposeRadioButton.text.toString()
            val sTrainingPurpose = trainingPurposeRadioButton.text.toString()
            val sTrainingCnt = trainingCntRadioButton.text.toString()
            val sTrainingTime = trainingTimeRadioButton.text.toString()
            val sDietCnt = sendCheck(dietCntBreakfast, dietCntLunch, dietCntDinner)
            // val sAllergy = allergyEdit.text.toString()
            val sSnackYn = snackynRadioButton.text.toString()
            // val sProPre = proPreEdit.text.toString()
//            val survey = Survey(
//                sHeight,
//                sWeight,
//                sProteinPurpose,
//                sTrainingPurpose,
//                sTrainingCnt,
//                sTrainingTime,
//                sDietCnt,
//                sAllergy,
//                sSnackYn,
//                sProPre
//            )
//            dao.add(survey).addOnSuccessListener(OnSuccessListener<Void?> {
//                Toast.makeText(applicationContext, "성공", Toast.LENGTH_SHORT).show()

            // 입력창 초기화
            heightEdit.setText("")
            weightEdit.setText("")
            proteinPurposeRadioButton.isChecked = false
            trainingPurposeRadioButton.isChecked = false
            trainingCntRadioButton.isChecked = false
            trainingTimeRadioButton.isChecked = false

//                dietCntEdit.setText("") //checkbox
//                allergyEdit.setText("") //checkbox

            snackynRadioButton.isChecked = false

//                proPreEdit.setText("") //checkbox

//            }).addOnFailureListener(OnFailureListener {
//                Toast.makeText(
//                    applicationContext,
//                    "실패",
//                    Toast.LENGTH_SHORT
//                ).show()
//            })
        }
    }

    private fun sendCheck(vararg checkBox:CheckBox): String? {
        var checked = ""
        for(ch in checkBox) {
            if (ch.isChecked) {
                checked += ch.text.toString() + ","
            }
        }

        val hArr = checked.split(",").toTypedArray()
        var result = ""
        for (i in hArr.indices) {
            result += if (i == hArr.size - 1) {
                hArr[i]
            } else {
                hArr[i] + ","
            }
        }
        return result
    }

}

