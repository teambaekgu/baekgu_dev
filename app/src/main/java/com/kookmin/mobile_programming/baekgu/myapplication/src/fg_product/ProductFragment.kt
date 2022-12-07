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
//    private val fishProductList=ArrayList<RecommendProductListDataClass>()
//    private val sauceChickenProductList=ArrayList<RecommendProductListDataClass>()
    private val chickenSteakProductList=ArrayList<RecommendProductListDataClass>()
//    private val beefSteakProductList=ArrayList<RecommendProductListDataClass>()
//    private val beefBallProductList=ArrayList<RecommendProductListDataClass>()






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setRecyclerView()
        setListener()

    }

    private fun setData(){


    }

    private fun setRecyclerView(){

        //닭가슴살볼
        recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx001_1,R.drawable.cbx001_2,R.drawable.cbx001_3,R.drawable.cbx001_4,"오리지널"))
        recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx002_1,R.drawable.cbx002_2,R.drawable.cbx002_3,R.drawable.cbx002_4,"스파이시"))
        recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx003_1,R.drawable.cbx003_2,R.drawable.cbx003_3,R.drawable.cbx003_4,"치즈"))
//        recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx004_1,R.drawable.cbx004_2,R.drawable.cbx004_3,R.drawable.cbx004_4,"깻잎"))
//        recommendProductList.add(RecommendProductListDataClass(R.drawable.cbx005_1,R.drawable.cbx005_2,R.drawable.cbx005_3,R.drawable.cbx005_4,"자반김"))

        //닭가슴살 소세지
        bestProductList.add(RecommendProductListDataClass(R.drawable.csx003_1,R.drawable.csx003_2,R.drawable.csx003_3,R.drawable.csx003_4,"청양고추"))
        bestProductList.add(RecommendProductListDataClass(R.drawable.csx007_1,R.drawable.csx007_2,R.drawable.csx007_3,R.drawable.csx007_4,"훈제"))
        bestProductList.add(RecommendProductListDataClass(R.drawable.csx005_1,R.drawable.csx005_2,R.drawable.csx005_3,R.drawable.csx005_4,"카레"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx001_1,R.drawable.csx001_2,R.drawable.csx001_3,R.drawable.csx001_4,"매콤치즈"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx002_1,R.drawable.csx002_2,R.drawable.csx002_3,R.drawable.csx002_4,"고추"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx004_1,R.drawable.csx004_2,R.drawable.csx004_3,R.drawable.csx004_4,"마늘"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx006_1,R.drawable.csx006_2,R.drawable.csx006_3,R.drawable.csx006_4,"불닭"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx008_1,R.drawable.csx008_2,R.drawable.csx008_3,R.drawable.csx008_4,"할라피뇨"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx009_1,R.drawable.csx009_2,R.drawable.csx009_3,R.drawable.csx009_4,"견과"))
//        bestProductList.add(RecommendProductListDataClass(R.drawable.csx0010_1,R.drawable.csx0010_2,R.drawable.csx0010_3,R.drawable.csx0010_4,"현미"))

        //달가슴살 스테이크
        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx001_1,R.drawable.stx001_2,R.drawable.stx001_3,R.drawable.stx001_4,"오리지널"))
        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx002_1,R.drawable.stx002_2,R.drawable.stx002_3,R.drawable.stx002_4,"갈릭"))
        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx003_1,R.drawable.stx003_2,R.drawable.stx003_3,R.drawable.stx003_4,"고추"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx004_1,R.drawable.stx004_2,R.drawable.stx004_3,R.drawable.stx004_4,"호박"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx005_1,R.drawable.stx005_2,R.drawable.stx005_3,R.drawable.stx005_4,"야채"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx006_1,R.drawable.stx006_2,R.drawable.stx006_3,R.drawable.stx006_4,"토마토"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx007_1,R.drawable.stx007_2,R.drawable.stx007_3,R.drawable.stx007_4,"로스트갈릭"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx008_1,R.drawable.stx008_2,R.drawable.stx008_3,R.drawable.stx008_4,"자색고구마"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx009_1,R.drawable.stx009_2,R.drawable.stx009_3,R.drawable.stx009_4,"매콤토마토"))
//        chickenSteakProductList.add(RecommendProductListDataClass(R.drawable.stx0010_1,R.drawable.stx0010_2,R.drawable.stx0010_3,R.drawable.stx0010_4,"흑마늘"))

        //소스 닭가슴살
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx001_1,R.drawable.scx001_2,R.drawable.scx001_3,R.drawable.scx001_4,"갈릭스테이크"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx002_1,R.drawable.scx002_2,R.drawable.scx002_3,R.drawable.scx002_4,"깐풍기"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx003_1,R.drawable.scx003_2,R.drawable.scx003_3,R.drawable.scx003_4,"레몬크림"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx004_1,R.drawable.scx004_2,R.drawable.scx004_3,R.drawable.scx004_4,"매콤바베큐"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx005_1,R.drawable.scx005_2,R.drawable.scx005_3,R.drawable.scx005_4,"매콤칠리"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx006_1,R.drawable.scx006_2,R.drawable.scx006_3,R.drawable.scx006_4,"까르보나라"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx007_1,R.drawable.scx007_2,R.drawable.scx007_3,R.drawable.scx007_4,"블랙소이"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx008_1,R.drawable.scx008_2,R.drawable.scx008_3,R.drawable.scx008_4,"짜장"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx009_1,R.drawable.scx009_2,R.drawable.scx009_3,R.drawable.scx009_4,"짬뽕"))
//        sauceChickenProductList.add(RecommendProductListDataClass(R.drawable.scx010_1,R.drawable.scx010_2,R.drawable.scx010_3,R.drawable.scx010_4,"머스터드"))

        //생선류
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx001_1,R.drawable.fx001_2,R.drawable.fx001_3,R.drawable.fx001_4,"고등어구이"))
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx002_1,R.drawable.fx002_2,R.drawable.fx002_3,R.drawable.fx002_4,"꽁치구이"))
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx003_1,R.drawable.fx003_2,R.drawable.fx003_3,R.drawable.fx003_4,"삼치구이"))
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx004_1,R.drawable.fx004_2,R.drawable.fx004_3,R.drawable.fx004_4,"연어구이"))
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx005_1,R.drawable.fx005_2,R.drawable.fx005_3,R.drawable.fx005_4,"장어 데리야끼"))
//        fishProductList.add(RecommendProductListDataClass(R.drawable.fx006_1,R.drawable.fx006_2,R.drawable.fx006_3,R.drawable.fx006_4,"장어 매콤"))



        binding.fgProductRvMain.adapter=RecommendProductListRvAdapter(recommendProductList)
        binding.fgProductRvMain.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(bestProductList)
        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(chickenSteakProductList)
        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

//        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(sauceChickenProductList)
//        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
//
//        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(fishProductList)
//        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

//        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(beefBallProductList)
//        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
//
//        binding.fgProductRvBest.adapter=RecommendProductListRvAdapter(beefSteakProductList)
//        binding.fgProductRvBest.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


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

        (binding.fgProductRvChickenSteak.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
            override fun onClick(position: Int) {
                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
                intent.putExtra("info",chickenSteakProductList[position])
                startActivity(intent)
            }

        })

//        (binding.fgProductRvSauceChicken.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
//            override fun onClick(position: Int) {
//                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
//                intent.putExtra("info",sauceChickenProductList[position])
//                startActivity(intent)
//            }
//
//        })
//
//        (binding.fgProductRvFish.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
//            override fun onClick(position: Int) {
//                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
//                intent.putExtra("info",fishProductList[position])
//                startActivity(intent)
//            }
//
//        })

//        (binding.fgProductRvBeefBall.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
//            override fun onClick(position: Int) {
//                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
//                intent.putExtra("info",beefBallProductList[position])
//                startActivity(intent)
//            }
//
//        })
//
//        (binding.fgProductRvBeefSteak.adapter as RecommendProductListRvAdapter).setItemClickListener(object :RecommendProductListRvAdapter.OnItemClickListener{
//            override fun onClick(position: Int) {
//                var intent=Intent(requireContext(),ProductDetailsActivity::class.java)
//                intent.putExtra("info",beefSteakProductList[position])
//                startActivity(intent)
//            }
//
//        })


    }
}