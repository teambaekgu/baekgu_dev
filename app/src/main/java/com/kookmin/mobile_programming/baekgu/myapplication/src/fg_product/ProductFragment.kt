package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProductBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv.RecommendProductListDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv.RecommendProductListRvAdapter

class ProductFragment: BaseFragment<FragmentProductBinding>(FragmentProductBinding::bind, R.layout.fragment_product) {
    private val recommendProductList=ArrayList<RecommendProductListDataClass>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setRecyclerView()
    }

    private fun setData(){


    }

    private fun setRecyclerView(){
        for(i in 0 until 5){
            recommendProductList.add(RecommendProductListDataClass(R.drawable.test_product))
        }
        binding.fgProductRvMain.adapter=RecommendProductListRvAdapter(recommendProductList)
        binding.fgProductRvMain.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }
}