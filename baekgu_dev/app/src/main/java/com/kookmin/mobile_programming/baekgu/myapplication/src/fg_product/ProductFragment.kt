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
    private val bestProductList=ArrayList<RecommendProductListDataClass>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setRecyclerView()
    }

    private fun setData(){


    }

    private fun setRecyclerView(){
            recommendProductList.add(RecommendProductListDataClass(R.drawable.test_image_2,"고등어구이"))
            recommendProductList.add(RecommendProductListDataClass(R.drawable.test_image_4,"연어구이"))
            recommendProductList.add(RecommendProductListDataClass(R.drawable.test_image_4,"연어구이"))

            bestProductList.add(RecommendProductListDataClass(R.drawable.test_image_1,"갈릭맛"))
            bestProductList.add(RecommendProductListDataClass(R.drawable.test_image_3,"레몬 크림 맛"))
            bestProductList.add(RecommendProductListDataClass(R.drawable.test_image_3,"레몬 크림 맛"))

        binding.fgProductRvMain.adapter=RecommendProductListRvAdapter(recommendProductList)
        binding.fgProductRvMain.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(bestProductList)
        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

    }
}