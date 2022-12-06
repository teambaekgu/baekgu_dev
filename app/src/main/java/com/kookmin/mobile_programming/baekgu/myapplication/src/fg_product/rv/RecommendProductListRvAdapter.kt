package com.kookmin.mobile_programming.baekgu.myapplication.src.fg_product.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ItemRecommendProductBinding

class RecommendProductListRvAdapter(val dataSet:ArrayList<RecommendProductListDataClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    interface OnItemClickListener {
        fun onClick(position: Int)
    }
    private lateinit var itemClickListener : OnItemClickListener

    fun setItemClickListener(itemClickListener: OnItemClickListener) {
        this.itemClickListener = itemClickListener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemRecommendProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return recommendProductViewHolder(binding).also { holder ->
            binding.root.setOnClickListener {
                this.itemClickListener.onClick(holder.adapterPosition)
            }

        }
    }
    //뷰8개 생성하는 코드임

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
            binding.itemRecommendProductImgMain.clipToOutline=true

            Glide.with(binding.root)
                .load(item.image)
                .centerCrop()
                .into(binding.itemRecommendProductImgMain)

            binding.itemRecommendProductTvTitle.text=item.title
        }

    }


}