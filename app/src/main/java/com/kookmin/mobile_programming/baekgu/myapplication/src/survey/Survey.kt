package com.example.firebasepratice

class Survey {
    var user_id: String? = null
    var user_height: String? = null
    var user_weight: String? = null
    var user_proteinPurpose: String? = null
    var user_trainingPurpose: String? = null
    var user_trainingCnt: String? = null
    var user_trainingTime: String? = null
    var user_dietCnt: List<String>? = null
    var user_allergy: List<String>? = null
    var user_snackYn: String? = null
    var user_proPre: List<Int>? = null
    var user_flaPre: List<Int>? = null



    internal constructor() {}
    constructor(
        user_id: String?,
        user_height: String?,
        user_weight: String?,
        user_proteinPurpose: String?,
        user_trainingPurpose: String?,
        user_trainingCnt: String?,
        user_trainingTime: String?,
        user_dietCnt: List<String>?,
        user_allergy: List<String>?,
        user_snackYn: String?,
        user_proPre: List<Int>?,
        user_flaPre: List<Int>?


    ) {
        this.user_id = user_id
        this.user_height = user_height
        this.user_weight = user_weight
        this.user_proteinPurpose = user_proteinPurpose
        this.user_trainingPurpose = user_trainingPurpose
        this.user_trainingCnt = user_trainingCnt
        this.user_trainingTime = user_trainingTime
        this.user_dietCnt = user_dietCnt
        this.user_allergy = user_allergy
        this.user_snackYn = user_snackYn
        this.user_proPre = user_proPre
        this.user_flaPre = user_flaPre
    }
}