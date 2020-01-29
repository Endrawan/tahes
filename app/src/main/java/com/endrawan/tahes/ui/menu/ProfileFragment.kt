package com.endrawan.tahes.ui.menu


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.endrawan.tahes.R
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(this)
            .load(R.drawable.stat1)
            .centerCrop()
            .into(stat1)

        Glide.with(this)
            .load(R.drawable.stat2)
            .centerCrop()
            .into(stat2)

        Glide.with(this)
            .load(R.drawable.header)
            .centerCrop()
            .into(header_image)

    }

}
