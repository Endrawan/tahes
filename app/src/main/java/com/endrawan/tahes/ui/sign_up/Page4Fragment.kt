package com.endrawan.tahes.ui.sign_up


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.endrawan.tahes.R
import kotlinx.android.synthetic.main.fragment_page4.*

/**
 * A simple [Fragment] subclass.
 */
class Page4Fragment : Fragment(R.layout.fragment_page4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(this)
            .load(R.drawable.welcome)
            .fitCenter()
            .into(image)
    }

}
