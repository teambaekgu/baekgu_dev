package com.kookmin.mobile_programming.baekgu.myapplication.src.product_details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityProductDetailsBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv.RecommendProductListDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.rv.ProductDetailsDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.rv.ProductDetailsRvAdpter


class ProductDetailsActivity: BaseActivity<ActivityProductDetailsBinding>(ActivityProductDetailsBinding::inflate) {

    private val productDetailsList=ArrayList<ProductDetailsDataClass>()
    private var receiveIntent: Intent?=null
    private var info:RecommendProductListDataClass?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        receiveIntent=intent
        info=receiveIntent?.getSerializableExtra("info") as RecommendProductListDataClass
//        binding.productDetailsTvTest.text=pos.toString()

        setRecyclerView()

    }

    private fun setRecyclerView(){

        productDetailsList.add(ProductDetailsDataClass(info!!.image_1))
        productDetailsList.add(ProductDetailsDataClass(info!!.image_2))
        productDetailsList.add(ProductDetailsDataClass(info!!.image_3))


        binding.productDetailsRvMain.layoutManager = LinearLayoutManager(this)
        binding.productDetailsRvMain.adapter = ProductDetailsRvAdpter(productDetailsList)



    }

}