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

class FoodsAdapter(val foods: List<Food>) : RecyclerView.Adapter<FoodsAdapter.TrainerFoodGridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainerFoodGridViewHolder =
        TrainerFoodGridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_food, parent, false))

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: TrainerFoodGridViewHolder, position: Int) {
        holder.bind(foods[position])
    }

    inner class TrainerFoodGridViewHolder(itemView: View) : BaseViewHolder<Food>(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.image)
        private val name = itemView.findViewById<TextView>(R.id.name)
        private val calories = itemView.findViewById<TextView>(R.id.calories)

        override fun bind(item: Food) {
            Glide.with(image.context)
                .load(item.image)
                .centerCrop()
                .into(image)

            name.text = item.name
            calories.text = item.calorie
        }

    }

}