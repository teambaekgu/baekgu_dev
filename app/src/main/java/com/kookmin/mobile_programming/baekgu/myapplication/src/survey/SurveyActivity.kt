package com.kookmin.mobile_programming.baekgu.myapplication.src.survey


import android.os.Bundle
import android.widget.*
import com.example.firebasepratice.Survey
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.R.*
import com.kookmin.mobile_programming.baekgu.myapplication.R.id.*
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding


class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_survey)

        // 컴포넌트 변수에 담기

        // 컴포넌트 변수에 담기
        val heightEdit = findViewById<EditText>(
            survey_edit_height
        )
        val weightEdit = findViewById<EditText>(survey_edit_weight)

        val proteinPurposeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_proteinpurpose)

        val trainingPurposeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainpurpose)

        val trainingCntRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainingcnt)



        val trainingTimeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainingtime)

        //https://wpioneer.tistory.com/23 -> checkbox 텍스트 처리
        // 체크박스 part
        //val dietCntEdit = findViewById<EditText>(dietCnt)
        //val allergyEdit = findViewById<EditText>(com.kookmin.mobile_programming.baekgu.myapplication.R.id.allergy)
        val dietCntBreakfast = findViewById<CheckBox>(survey_cb_dietcnt_breakfast)
        var dietCntLunch = findViewById<CheckBox>(survey_cb_dietcnt_lunch)
        var dietCntDinner = findViewById<CheckBox>(survey_cb_dietcnt_dinner);


        // 알러지
        var allergy1 = findViewById<CheckBox>(survey_cb_allergy_1)
        var allergy2 = findViewById<CheckBox>(survey_cb_allergy_2)
        var allergy3 = findViewById<CheckBox>(survey_cb_allergy_3)
        var allergy4 = findViewById<CheckBox>(survey_cb_allergy_4)
        var allergy5 = findViewById<CheckBox>(survey_cb_allergy_5)
        var allergy6 = findViewById<CheckBox>(survey_cb_allergy_6)
        var allergy7 = findViewById<CheckBox>(survey_cb_allergy_7)
        var allergy8 = findViewById<CheckBox>(survey_cb_allergy_8)
        var allergy9 = findViewById<CheckBox>(survey_cb_allergy_9)
        var allergy10 = findViewById<CheckBox>(survey_cb_allergy_10)
        var allergy11 = findViewById<CheckBox>(survey_cb_allergy_11)
        var allergy12= findViewById<CheckBox>(survey_cb_allergy_12)
        var allergy13 = findViewById<CheckBox>(survey_cb_allergy_13)
        var allergy14 = findViewById<CheckBox>(survey_cb_allergy_14)
        var allergy15 = findViewById<CheckBox>(survey_cb_allergy_15)
        var allergy16 = findViewById<CheckBox>(survey_cb_allergy_16)
        var allergy17 = findViewById<CheckBox>(survey_cb_allergy_17)
        var allergy18 = findViewById<CheckBox>(survey_cb_allergy_18)
        var allergy19 = findViewById<CheckBox>(survey_cb_allergy_19)


        val snackynRadioButtonGroup = findViewById<RadioGroup>(survey_rg_snackyn)


        // 체크박스 part
        // val proPreEdit = findViewById<EditText>(id.proPre)

        val addBtn = findViewById<Button>(survey_btn_save)

         val dao = DAOSurvey()
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
            val proteinPurposeRadioButton = findViewById<RadioButton>(proteinPurposeRadioButtonGroup.checkedRadioButtonId)
            val sProteinPurpose = proteinPurposeRadioButton.text.toString()

            val trainingPurposeRadioButton = findViewById<RadioButton>(trainingPurposeRadioButtonGroup.checkedRadioButtonId)
            val sTrainingPurpose = trainingPurposeRadioButton.text.toString()

            val trainingCntRadioButton = findViewById<RadioButton>(trainingCntRadioButtonGroup.checkedRadioButtonId)
            val sTrainingCnt = trainingCntRadioButton.text.toString()

            val trainingTimeRadioButton = findViewById<RadioButton>(trainingTimeRadioButtonGroup.checkedRadioButtonId)
            val sTrainingTime = trainingTimeRadioButton.text.toString()

            val sDietCnt = sendCheck(dietCntBreakfast, dietCntLunch, dietCntDinner)
            val sAllergy = sendCheck(allergy1,allergy2,allergy3,allergy4,allergy5, allergy6, allergy7, allergy8, allergy9, allergy10,
                                        allergy11, allergy12, allergy13, allergy14, allergy15, allergy16, allergy17, allergy18, allergy19)

            val snackynRadioButton = findViewById<RadioButton>(snackynRadioButtonGroup.checkedRadioButtonId)
            val sSnackYn = snackynRadioButton.text.toString()

            // val sProPre = proPreEdit.text.toString()
            val survey = Survey(
                sHeight,
                sWeight,
                sProteinPurpose,
                sTrainingPurpose,
                sTrainingCnt,
                sTrainingTime,
                sDietCnt,
                sAllergy,
                sSnackYn,
//                sProPre
            )
            dao.add(survey).addOnSuccessListener(OnSuccessListener<Void?> {
                Toast.makeText(applicationContext, "성공", Toast.LENGTH_SHORT).show()

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

            }).addOnFailureListener(OnFailureListener {
                Toast.makeText(
                    applicationContext,
                    "실패",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }

    private fun sendCheck(vararg checkBox:CheckBox): List<String> {
        var checked = ""
        for(ch in checkBox) {
            if (ch.isChecked) {
                checked += ch.text.toString() + ","
            }
        }

        val hArr = checked.split(",").toTypedArray()
        val result =  hArr.toList()
        return result.subList(0, result.size-1)
    }

}


