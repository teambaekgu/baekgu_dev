package com.kookmin.mobile_programming.baekgu.myapplication.src.product_details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityProductDetailsBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.rv.ProductDetailsDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.rv.ProductDetailsRvAdpter


class ProductDetailsActivity: BaseActivity<ActivityProductDetailsBinding>(ActivityProductDetailsBinding::inflate) {

    private val productDetailsList=ArrayList<ProductDetailsDataClass>()
    private var receiveIntent: Intent?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        receiveIntent=intent
        var pos=receiveIntent?.getIntExtra("pos",1)

//        binding.productDetailsTvTest.text=pos.toString()

        setRecyclerView()

    }

    private fun setRecyclerView(){

        productDetailsList.add(ProductDetailsDataClass(R.drawable.test_image_2))
        productDetailsList.add(ProductDetailsDataClass(R.drawable.test_image_2))
        productDetailsList.add(ProductDetailsDataClass(R.drawable.test_image_2))


        binding.productDetailsRvMain.layoutManager = LinearLayoutManager(this)
        binding.productDetailsRvMain.adapter = ProductDetailsRvAdpter(productDetailsList)



    }

}