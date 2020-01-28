package com.endrawan.tahes.models

import com.endrawan.tahes.R

object Dummy {

    val ACTION_TYPE_FOOD = 1
    val ACTION_TYPE_FOOD_ACTIVE = 2
    val ACTION_TYPE_WORKOUT = 3

    val TRAINER_FOOD_TYPE_GRID = 1
    val TRAINER_FOOD_TYPE_LINEAR = 2

    val foods = listOf(
        Food("Jeruk", "2 Buah", "250 kkal", R.drawable.sample2),
        Food("Rendang", "1 Porsi", "500 kkal", R.drawable.sample2),
        Food("Susu", "2 Buah", "380 kkal", R.drawable.sample2),
        Food("Timun", "1 Buah", "140 kkal", R.drawable.sample2)
    )

    val actions = listOf(
        Action("Sarapan", "08:30 AM", "880 kkal", ACTION_TYPE_FOOD, foods),
        Action("Makan Siang", "12:00 PM", "1080 kkal", ACTION_TYPE_FOOD_ACTIVE, foods),
        Action("Olah Raga", "14:30 PM", "-230 kkal", ACTION_TYPE_WORKOUT, foods),
        Action("Makan Malam", "19:00 PM", "1000 kkal", ACTION_TYPE_FOOD, foods)
    )

}