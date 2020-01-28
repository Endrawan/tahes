package com.endrawan.tahes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.endrawan.tahes.R
import com.endrawan.tahes.custom_components.BaseViewHolder
import com.endrawan.tahes.models.Food

class TrainerFoodGridAdapter(val foods: List<Food>) : RecyclerView.Adapter<TrainerFoodGridAdapter.TrainerFoodGridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainerFoodGridViewHolder =
        TrainerFoodGridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_grid_food_list, parent, false))

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: TrainerFoodGridViewHolder, position: Int) {
        holder.bind(foods[position])
    }

    inner class TrainerFoodGridViewHolder(itemView: View) : BaseViewHolder<Food>(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.image)

        override fun bind(item: Food) {
            Glide.with(image.context)
                .load(item.image)
                .centerCrop()
                .into(image)
        }

    }

}