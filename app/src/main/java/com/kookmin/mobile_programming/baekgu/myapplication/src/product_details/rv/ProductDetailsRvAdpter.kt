package com.kookmin.mobile_programming.baekgu.myapplication.src.product_details.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ItemProductDetailsBinding



class ProductDetailsRvAdpter(val dataSet:ArrayList<ProductDetailsDataClass>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemProductDetailsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return productDetailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is productDetailsViewHolder){
            holder.bind(dataSet[position])
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class productDetailsViewHolder(val binding: ItemProductDetailsBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(item:ProductDetailsDataClass){
            binding.itemProductDetailsImgMain.clipToOutline = true

            Glide.with(binding.root)
                .load(item.image)
                .centerCrop()
                .into(binding.itemProductDetailsImgMain)

        }

    }
}
