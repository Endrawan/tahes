package com.endrawan.tahes.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.endrawan.tahes.ui.sign_up.Page1Fragment
import com.endrawan.tahes.ui.sign_up.Page2Fragment
import com.endrawan.tahes.ui.sign_up.Page3Fragment
import com.endrawan.tahes.ui.sign_up.Page4Fragment

class SignUpFragmentAdapter(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val steps = listOf(
        Page1Fragment(),
        Page2Fragment(),
        Page3Fragment(),
        Page4Fragment()
    )

    private val NUM_ITEMS = 4

    override fun getItem(position: Int): Fragment = steps[position]

    override fun getCount(): Int = NUM_ITEMS
}