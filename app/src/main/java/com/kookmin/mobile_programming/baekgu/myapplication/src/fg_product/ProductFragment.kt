package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseFragment
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.FragmentProductBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv.RecommendProductListDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv.RecommendProductListRvAdapter
import com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.ProductDetailsActivity

class ProductFragment: BaseFragment<FragmentProductBinding>(FragmentProductBinding::bind, R.layout.fragment_product) {
    private val recommendProductList=ArrayList<RecommendProductListDataClass>()
    private val bestProductList=ArrayList<RecommendProductListDataClass>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setRecyclerView()
        setListener()

    }

    private fun setData(){


    }

    private fun setRecyclerView(){
            recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx001_1,R.drawable.cbx001_2,R.drawable.cbx001_3,R.drawable.cbx001_4,"오리지널"))
            recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx002_1,R.drawable.cbx002_2,R.drawable.cbx002_3,R.drawable.cbx002_4,"스파이시"))
            recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx003_1,R.drawable.cbx003_2,R.drawable.cbx003_3,R.drawable.cbx003_4,"치즈 맛"))

            bestProductList.add(RecommendProductListDataClass(R.drawable.csx003_1,R.drawable.csx003_2,R.drawable.csx003_3,R.drawable.csx003_4,"청양고추 맛"))
            bestProductList.add(RecommendProductListDataClass(R.drawable.csx007_1,R.drawable.csx007_2,R.drawable.csx007_3,R.drawable.csx007_4,"훈제 맛"))
            bestProductList.add(RecommendProductListDataClass(R.drawable.csx005_1,R.drawable.csx005_2,R.drawable.csx005_3,R.drawable.csx005_4,"카레 맛"))

        binding.fgProductRvMain.adapter=RecommendProductListRvAdapter(recommendProductList)
        binding.fgProductRvMain.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(bestProductList)
        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

    }

    private fun setListener(){
        (binding.fgProductRvMain.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
            override fun onClick(position: Int) {
                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
                intent.putExtra("info",recommendProductList[position])
                startActivity(intent)
            }

        })

        (binding.fgProductRvBest.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
            override fun onClick(position: Int) {
                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
                intent.putExtra("info",bestProductList[position])
                startActivity(intent)
            }
        })
    }
}