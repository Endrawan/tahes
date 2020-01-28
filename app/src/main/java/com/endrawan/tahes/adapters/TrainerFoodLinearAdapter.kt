package com.endrawan.tahes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.endrawan.tahes.R
import com.endrawan.tahes.custom_components.BaseViewHolder
import com.endrawan.tahes.models.Food

class TrainerFoodLinearAdapter(val foods: List<Food>) : RecyclerView.Adapter<TrainerFoodLinearAdapter.TrainerFoodLinearViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainerFoodLinearViewHolder =
        TrainerFoodLinearViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_food_list, parent, false))

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: TrainerFoodLinearViewHolder, position: Int) {
        holder.bind(foods[position])
    }

    inner class TrainerFoodLinearViewHolder(itemView: View) : BaseViewHolder<Food>(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.image)
        private val name = itemView.findViewById<TextView>(R.id.name)
        private val calories = itemView.findViewById<TextView>(R.id.calories)
        private val portion = itemView.findViewById<TextView>(R.id.portion)

        override fun bind(item: Food) {

            name.text = item.name
            calories.text = item.calorie
            portion.text = item.portion

            Glide.with(image.context)
                .load(item.image)
                .centerCrop()
                .into(image)
        }

    }

}