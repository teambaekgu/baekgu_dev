package com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.kookmin.mobile_programming.baekgu.myapplication.R
import com.kookmin.mobile_programming.baekgu.myapplication.config.BaseActivity
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ActivityDietDetailsBinding
import com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.rv.DietDetailsDataClass
import com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.rv.DietDetailsRvAdapter
import com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.util.HorizontalMarginItemDecoration

class DietDetailsActivity:BaseActivity<ActivityDietDetailsBinding>(ActivityDietDetailsBinding::inflate) {
    private val dietList=ArrayList<DietDetailsDataClass>()
    private lateinit var receiveIntent: Intent
    private var date:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        receiveIntent=intent
        if(receiveIntent!=null){
            if(!receiveIntent.getStringExtra("date")!!.isEmpty()){
                date=receiveIntent.getStringExtra("date")!!
            }

        }

        Log.d("weagawgawg","${date}")



        for(i in 0 until 5){
            dietList.add(DietDetailsDataClass(date))
        }
        setViewPager()
    }

    private fun setViewPager(){
        binding.dietDetailsVp2Main.adapter = DietDetailsRvAdapter(dietList)



        // You need to retain one page on each side so that the next and previous items are visible
        binding.dietDetailsVp2Main.offscreenPageLimit = 1

        // Add a PageTransformer that translates the next and previous items horizontally
        // towards the center of the screen, which makes them visible
        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible)
        val currentItemHorizontalMarginPx = resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position
            // Next line scales the item's height. You can remove it if you don't want this effect
            page.scaleY = 1 - (0.1f * Math.abs(position))
            page.scaleX=1f
            // If you want a fading effect uncomment the next line:
            // page.alpha = 0.25f + (1 - abs(position))
        }

        binding.dietDetailsVp2Main.setPageTransformer(pageTransformer)

        // The ItemDecoration gives the current (centered) item horizontal margin so that
        // it doesn't occupy the whole screen width. Without it the items overlap
        val itemDecoration = HorizontalMarginItemDecoration(
            this,
            R.dimen.viewpager_current_item_horizontal_margin
        )
        binding.dietDetailsVp2Main.addItemDecoration(itemDecoration)

        binding.dietDetailsVp2Main.setCurrentItem(1,false)
    }
}