package com.kookmin.mobile_programming.baekgu.myapplication.src.survey

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding

class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

    var firebaseDatabase: FirebaseDatabase? = null
    var databaseReference: DatabaseReference? = null

    var semail: String? = null
    var sHeight: String? = null
    var sWeight: String? = null
    var sProteinPurpose: String? = null
    var sSnackYn: String? = null
    var sTrainingTime: String? = null
    var sTrainingPurpose: String? = null
    var sTrainingCnt: String? = null

    var sDietCnt: ArrayList<String>? = null
    var sAllergy: ArrayList<String>? = null
    var sPropre: ArrayList<Int>? = null
    var sFlapre: ArrayList<Int>? = null

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

    }

}