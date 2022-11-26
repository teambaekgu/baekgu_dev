package com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ItemDietDetailsBinding

class DietDetailsRvAdapter(val dataSet:ArrayList<DietDetailsDataClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemDietDetailsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return dietDetailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is dietDetailsViewHolder){
            holder.bind(dataSet[position])
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class dietDetailsViewHolder(val binding:ItemDietDetailsBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(item:DietDetailsDataClass){


        }

    }
}