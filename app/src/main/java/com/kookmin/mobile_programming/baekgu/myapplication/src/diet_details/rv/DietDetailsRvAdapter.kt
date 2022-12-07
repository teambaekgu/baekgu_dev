package com.kookmin.mobile_programming.baekgu.myapplication.src.diet_details.rv

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kookmin.mobile_programming.baekgu.myapplication.databinding.ItemDietDetailsBinding

class DietDetailsRvAdapter(val dataSet:ArrayList<DietDetailsDataClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface OnItemClickListener {
        fun onClick(position: Int,addAmount:Int)
    }
    private lateinit var itemClickListener : OnItemClickListener

    fun setItemClickListener(itemClickListener: OnItemClickListener) {
        this.itemClickListener = itemClickListener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemDietDetailsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return dietDetailsViewHolder(binding).also { holder ->

            binding.itemDietDetailsChbBreakfast.setOnCheckedChangeListener { compoundButton, b ->
                Log.d("weagwaegewag","${holder.adapterPosition} ,${b}")
                if(b){
                    this.itemClickListener.onClick(holder.adapterPosition,dataSet[holder.adapterPosition].breakFast.split("?")[1].toInt())
                }else{
                    this.itemClickListener.onClick(holder.adapterPosition,-dataSet[holder.adapterPosition].breakFast.split("?")[1].toInt())
                }
            }

            binding.itemDietDetailsChbLunch.setOnCheckedChangeListener { compoundButton, b ->
                if(b){
                    this.itemClickListener.onClick(holder.adapterPosition,dataSet[holder.adapterPosition].lunch.split("?")[1].toInt())
                }else{
                    this.itemClickListener.onClick(holder.adapterPosition,-dataSet[holder.adapterPosition].lunch.split("?")[1].toInt())
                }
            }

            binding.itemDietDetailsChbDinner.setOnCheckedChangeListener { compoundButton, b ->
                Log.d("weagwaegewag","${holder.adapterPosition} ,${b}")
                if(b){
                    this.itemClickListener.onClick(holder.adapterPosition,dataSet[holder.adapterPosition].dinner.split("?")[1].toInt())
                }else{
                    this.itemClickListener.onClick(holder.adapterPosition,-dataSet[holder.adapterPosition].dinner.split("?")[1].toInt())
                }
            }

            binding.itemDietDetailsChbSnack1.setOnCheckedChangeListener { compoundButton, b ->
                Log.d("weagwaegewag","${holder.adapterPosition} ,${b}")
                if(b){
                    this.itemClickListener.onClick(holder.adapterPosition,dataSet[holder.adapterPosition].snack_1.split("?")[1].toInt())
                }else{
                    this.itemClickListener.onClick(holder.adapterPosition,-dataSet[holder.adapterPosition].snack_1.split("?")[1].toInt())
                }
            }

            binding.itemDietDetailsChbSnack2.setOnCheckedChangeListener { compoundButton, b ->
                Log.d("weagwaegewag","${holder.adapterPosition} ,${b}")
                if(b){
                    this.itemClickListener.onClick(holder.adapterPosition,dataSet[holder.adapterPosition].snack_2.split("?")[1].toInt())
                }else{
                    this.itemClickListener.onClick(holder.adapterPosition,-dataSet[holder.adapterPosition].snack_2.split("?")[1].toInt())
                }
            }

        }
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

            binding.itemDietDetailsTvMonth.text="${item.month}.${item.day}"

            binding.itemDietDetailsTvBreakfastContent.text=item.breakFast.split("?")[0]
            binding.itemDietDetailsTvLunchContent.text=item.lunch.split("?")[0]
            binding.itemDietDetailsTvDinnerContent.text=item.dinner.split("?")[0]
            binding.itemDietDetailsTvSnack1Content.text=item.snack_1.split("?")[0]
            binding.itemDietDetailsTvSnack2Content.text=item.snack_2.split("?")[0]
        }

    }
}