package com.kookmin.mobile_programming.baekgu.myapplication.src.survey


import android.R
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.firebasepratice.Survey
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.*
import com.kookmin.mobile_programming.baekgu.myapplication.R.id.*
import com.kookmin.mobile_programming.baekgu.myapplication.R.layout
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivitySurveyBinding


class SurveyActivity:BaseActivity<ActivitySurveyBinding>(ActivitySurveyBinding::inflate) {

    var arrayList = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    
    var firebaseDatabase: FirebaseDatabase? = null
    var databaseReference: DatabaseReference? = null

    var listView: ListView? = null

    var sHeight: String? = null
    var sWeight: String? = null
    var sProteinPurpose: String? = null
    var sSnackYn : String? = null
    var sTrainingTime: String? = null
    var sTrainingPurpose: String? = null
    var sTrainingCnt : String? = null

    var sAllergy: ArrayList<String>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_survey)


        // 컴포넌트 변수에 담기
        val heightEdit = findViewById<EditText>(
            survey_edit_height
        )
        val weightEdit = findViewById<EditText>(survey_edit_weight)

        val proteinPurposeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_proteinpurpose)

        val trainingPurposeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainpurpose)

        val trainingCntRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainingcnt)


        val trainingTimeRadioButtonGroup = findViewById<RadioGroup>(survey_rg_trainingtime)

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
        var allergy12 = findViewById<CheckBox>(survey_cb_allergy_12)
        var allergy13 = findViewById<CheckBox>(survey_cb_allergy_13)
        var allergy14 = findViewById<CheckBox>(survey_cb_allergy_14)
        var allergy15 = findViewById<CheckBox>(survey_cb_allergy_15)
        var allergy16 = findViewById<CheckBox>(survey_cb_allergy_16)
        var allergy17 = findViewById<CheckBox>(survey_cb_allergy_17)
        var allergy18 = findViewById<CheckBox>(survey_cb_allergy_18)
        var allergy19 = findViewById<CheckBox>(survey_cb_allergy_19)


        val snackynRadioButtonGroup = findViewById<RadioGroup>(survey_rg_snackyn)

        val proPre1 = findViewById<RadioGroup>(survey_rg_chickensteak)
        val proPre2 = findViewById<RadioGroup>(survey_rg_chickensausage)
        val proPre3 = findViewById<RadioGroup>(survey_rg_saucechicken)
        val proPre4 = findViewById<RadioGroup>(survey_rg_chickenball)
        val proPre5 = findViewById<RadioGroup>(survey_rg_beefball)
        val proPre6 = findViewById<RadioGroup>(survey_rg_beefsteak)
        val proPre7 = findViewById<RadioGroup>(survey_rg_chickendumpling)
        val proPre8 = findViewById<RadioGroup>(survey_rg_chickenfishcake)
        val proPre9 = findViewById<RadioGroup>(survey_rg_godeungeo)
        val proPre10 = findViewById<RadioGroup>(survey_rg_samchi)
        val proPre11 = findViewById<RadioGroup>(survey_rg_kkongchi)

        val flaPre1 = findViewById<RadioGroup>(survey_rg_original)
        val flaPre2 = findViewById<RadioGroup>(survey_rg_garlic)
        val flaPre3 = findViewById<RadioGroup>(survey_rg_pepper)
        val flaPre4 = findViewById<RadioGroup>(survey_rg_cream)
        val flaPre5 = findViewById<RadioGroup>(survey_rg_curry)
        val flaPre6 = findViewById<RadioGroup>(survey_rg_smoke)
        val flaPre7 = findViewById<RadioGroup>(survey_rg_tomato)
        val flaPre8 = findViewById<RadioGroup>(survey_rg_black)
        val flaPre9 = findViewById<RadioGroup>(survey_rg_red)
        val flaPre10 = findViewById<RadioGroup>(survey_rg_soy)


        val addBtn = findViewById<Button>(survey_btn_save)

        val dao = DAOSurvey()

        listView = findViewById(list_View);

        // 어뎁터 초기화
        adapter = ArrayAdapter(this, R.layout.simple_list_item_1, arrayList)

        // 데이터베이스 초기화
        firebaseDatabase = FirebaseDatabase.getInstance();

        // 레퍼런스 초기화
        databaseReference = firebaseDatabase!!.getReference().child("Survey");

        // 데이터 조회
        getValue()


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

            val sPropre1 = findViewById<RadioButton>(proPre1.checkedRadioButtonId).text.toString()
            val sPropre2 = findViewById<RadioButton>(proPre2.checkedRadioButtonId).text.toString()
            val sPropre3 = findViewById<RadioButton>(proPre3.checkedRadioButtonId).text.toString()
            val sPropre4 = findViewById<RadioButton>(proPre4.checkedRadioButtonId).text.toString()
            val sPropre5 = findViewById<RadioButton>(proPre5.checkedRadioButtonId).text.toString()
            val sPropre6 = findViewById<RadioButton>(proPre6.checkedRadioButtonId).text.toString()
            val sPropre7 = findViewById<RadioButton>(proPre7.checkedRadioButtonId).text.toString()
            val sPropre8 = findViewById<RadioButton>(proPre8.checkedRadioButtonId).text.toString()
            val sPropre9 = findViewById<RadioButton>(proPre9.checkedRadioButtonId).text.toString()
            val sPropre10 = findViewById<RadioButton>(proPre10.checkedRadioButtonId).text.toString()
            val sPropre11 = findViewById<RadioButton>(proPre11.checkedRadioButtonId).text.toString()
            val sPropreResult = sendRadio(sPropre1, sPropre2, sPropre3, sPropre4, sPropre5, sPropre6,
                sPropre7, sPropre8,sPropre9,sPropre10, sPropre11)

            val sFlapre1 = findViewById<RadioButton>(flaPre1.checkedRadioButtonId).text.toString()
            val sFlapre2 = findViewById<RadioButton>(flaPre2.checkedRadioButtonId).text.toString()
            val sFlapre3 = findViewById<RadioButton>(flaPre3.checkedRadioButtonId).text.toString()
            val sFlapre4 = findViewById<RadioButton>(flaPre4.checkedRadioButtonId).text.toString()
            val sFlapre5 = findViewById<RadioButton>(flaPre5.checkedRadioButtonId).text.toString()
            val sFlapre6 = findViewById<RadioButton>(flaPre6.checkedRadioButtonId).text.toString()
            val sFlapre7 = findViewById<RadioButton>(flaPre7.checkedRadioButtonId).text.toString()
            val sFlapre8 = findViewById<RadioButton>(flaPre8.checkedRadioButtonId).text.toString()
            val sFlapre9 = findViewById<RadioButton>(flaPre9.checkedRadioButtonId).text.toString()
            val sFlapre10 = findViewById<RadioButton>(flaPre10.checkedRadioButtonId).text.toString()
            val sFlapreResult = sendRadio(sFlapre1, sFlapre2, sFlapre3, sFlapre4, sFlapre5, sFlapre6, sFlapre7,sFlapre8,sFlapre9,sFlapre10)


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
                sPropreResult,
                sFlapreResult
            )
            dao.add(survey).addOnSuccessListener(OnSuccessListener<Void?> {
                Toast.makeText(applicationContext, "성공", Toast.LENGTH_SHORT).show()
                // Read from the database


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


//            snackynRadioButton.isChecked = false

                //proPreEdit.setText("") //checkbox

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

    private fun getValue() {
        databaseReference!!.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                arrayList.clear()
                for (dataSnapshot in snapshot.children) {
                    val sFHeight = dataSnapshot.child("user_height").getValue(String::class.java)
                    val sFWeight = dataSnapshot.child("user_weight").getValue(String::class.java)
                    val sFProteinPurpose = dataSnapshot.child("user_proteinPurpose").getValue(String::class.java)
                    val sFSnackYn = dataSnapshot.child("user_snackYn").getValue(String::class.java)
                    val sFTrainingCnt = dataSnapshot.child("user_trainingCnt").getValue(String::class.java)
                    val sFTrainingPurpose = dataSnapshot.child("user_trainingPurpose").getValue(String::class.java)
                    val sFTrainingTime = dataSnapshot.child("user_trainingTime").getValue(String::class.java)
                    //sAllergyval sAl = dataSnapshot.child("user_trainingTime").getValue(String::class.java)

                    sHeight = sFHeight
                    sWeight = sFWeight
                    sProteinPurpose = sFProteinPurpose
                    sSnackYn = sFSnackYn
                    sTrainingCnt = sFTrainingCnt
                    sTrainingPurpose = sFTrainingPurpose
                    sTrainingTime = sFTrainingTime


                    Log.d("키", sHeight!!)
                    Log.d("무게", sWeight!!)
                    Log.d("단백질 섭취 목적", sProteinPurpose!!)
                    Log.d("간식 여부", sSnackYn!!)
                    Log.d("훈련 횟수", sTrainingCnt!!)
                    Log.d("훈련 목적", sTrainingPurpose!!)
                    Log.d("훈련 시간", sTrainingTime!!)

//                    arrayList.add(sFHeight!!)
//                    arrayList.add(sFWeight!!)
//                    //arrayList.add(sFPurpose!!)
                }
                listView!!.adapter = adapter
            }

            override fun onCancelled(error: DatabaseError) {}
        })
    }

}
