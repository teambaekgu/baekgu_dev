package com.kookmin.mobile_programming.baekgu.myapplication.src.survey

import com.example.firebasepratice.Survey
import com.google.android.gms.tasks.Task

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DAOSurvey internal constructor() {
    private val databaseReference: DatabaseReference

    init {
        val db: FirebaseDatabase = FirebaseDatabase.getInstance()
        databaseReference = db.getReference(Survey::class.java.getSimpleName())
    }

    // 등록
    fun add(survey: Survey?): Task<Void> {
        return databaseReference.push().setValue(survey)
    }
}