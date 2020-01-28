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
import com.endrawan.tahes.models.Workout

class WorkoutsAdapter(private val workouts: List<Workout>) : RecyclerView.Adapter<WorkoutsAdapter.WorkoutViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder =
        WorkoutViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_linear_workout, parent, false))

    override fun getItemCount(): Int = workouts.size

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        holder.bind(workouts[position])
    }

    inner class WorkoutViewHolder(itemView: View) : BaseViewHolder<Workout>(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.image)
        private val title = itemView.findViewById<TextView>(R.id.title)
        private val totalMoves = itemView.findViewById<TextView>(R.id.total_moves)
        private val totalTime = itemView.findViewById<TextView>(R.id.total_time)
        private val totalCalories = itemView.findViewById<TextView>(R.id.total_calories)
        private val difficulty = itemView.findViewById<TextView>(R.id.difficulty)

        override fun bind(item: Workout) {
            Glide.with(image.context)
                .load(item.image)
                .centerCrop()
                .into(image)

            title.text = item.title
            totalMoves.text = item.totalMoves
            totalTime.text = item.totalTime
            totalCalories.text = item.totalCalories
            difficulty.text = item.difficulty
        }

    }

}