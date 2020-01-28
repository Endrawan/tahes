package com.endrawan.tahes.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.endrawan.tahes.R
import com.endrawan.tahes.custom_components.BaseViewHolder
import com.endrawan.tahes.models.Action
import com.endrawan.tahes.models.Dummy

class TrainerAdapter(val actions: List<Action>, val context: Context?) : RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when(viewType) {
            Dummy.ACTION_TYPE_FOOD ->
                FoodViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_action_food, parent, false))
            Dummy.ACTION_TYPE_FOOD_ACTIVE ->
                FoodActiveViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_action_food_active, parent, false))
            Dummy.ACTION_TYPE_WORKOUT ->
                WorkoutViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_action_workout, parent, false))
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        val action = actions[position]
        when(holder) {
            is FoodViewHolder -> holder.bind(action)
            is FoodActiveViewHolder -> holder.bind(action)
            is WorkoutViewHolder -> holder.bind(action)
        }
    }

    override fun getItemCount(): Int = actions.size

    override fun getItemViewType(position: Int): Int =
        actions[position].type

    inner class FoodViewHolder(itemView: View) : BaseViewHolder<Action>(itemView) {

        private val name = itemView.findViewById<TextView>(R.id.name)
        private val time = itemView.findViewById<TextView>(R.id.time)
        private val calories = itemView.findViewById<TextView>(R.id.calories)
        private val recyclerView = itemView.findViewById<RecyclerView>(R.id.recyclerView)

        override fun bind(item: Action) {
            name.text = item.name
            time.text = item.time
            calories.text = item.calorie

            recyclerView.adapter = TrainerFoodGridAdapter(item.foods)
            recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        }

    }

    inner class FoodActiveViewHolder(itemView: View) : BaseViewHolder<Action>(itemView) {

        private val name = itemView.findViewById<TextView>(R.id.name)
        private val time = itemView.findViewById<TextView>(R.id.time)
        private val calories = itemView.findViewById<TextView>(R.id.calories)
        private val recyclerView = itemView.findViewById<RecyclerView>(R.id.recyclerView)

        override fun bind(item: Action) {
            name.text = item.name
            time.text = item.time
            calories.text = item.calorie

            recyclerView.adapter = TrainerFoodLinearAdapter(item.foods)
            recyclerView.layoutManager = LinearLayoutManager(context)
        }

    }

    inner class WorkoutViewHolder(itemView: View) : BaseViewHolder<Action>(itemView) {


        private val name = itemView.findViewById<TextView>(R.id.name)
        private val time = itemView.findViewById<TextView>(R.id.time)
        private val calories = itemView.findViewById<TextView>(R.id.calories)
        private val background = itemView.findViewById<ImageView>(R.id.background)

        override fun bind(item: Action) {
            name.text = item.name
            time.text = item.time
            calories.text = item.calorie

            Glide.with(background.context)
                .load(R.drawable.sample)
                .centerCrop()
                .into(background)
        }
    }

}