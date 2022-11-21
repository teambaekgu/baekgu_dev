package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ItemRecommendProductBinding

class RecommendProductListRvAdapter(val dataSet:ArrayList<RecommendProductListDataClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemRecommendProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return recommendProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is recommendProductViewHolder){
            holder.bind(dataSet[position])
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


    class recommendProductViewHolder(val binding:ItemRecommendProductBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(item:RecommendProductListDataClass){

            Glide.with(binding.root)
                .load(item.image)
                .centerCrop()
                .into(binding.itemRecommendProductImgMain)
        }

    }


}