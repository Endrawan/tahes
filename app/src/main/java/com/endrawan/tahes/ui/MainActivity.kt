package com.endrawan.tahes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.endrawan.tahes.R
import com.endrawan.tahes.ui.menu.FoodFragment
import com.endrawan.tahes.ui.menu.ProfileFragment
import com.endrawan.tahes.ui.menu.TrainerFragment
import com.endrawan.tahes.ui.menu.WorkoutFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var fm: FragmentManager
    private val trainerFragment = TrainerFragment()
    private val foodFragment = FoodFragment()
    private val workoutFragment = WorkoutFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.container, trainerFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.trainer -> {
                    changeView(trainerFragment)
                    true
                }
                R.id.foods -> {
                    changeView(foodFragment)
                    true
                }
                R.id.workouts -> {
                    changeView(workoutFragment)
                    true
                }
                R.id.profile -> {
                    changeView(profileFragment)
                    true
                }
                else -> false
            }
        }
    }

    fun changeView(fragment: Fragment) {
        fm.beginTransaction().replace(R.id.container, fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()
    }
}
