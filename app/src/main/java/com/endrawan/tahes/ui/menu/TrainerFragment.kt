package com.endrawan.tahes.ui.menu


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.endrawan.tahes.R
import com.endrawan.tahes.adapters.TrainerAdapter
import com.endrawan.tahes.models.Dummy
import kotlinx.android.synthetic.main.fragment_trainer.*

/**
 * A simple [Fragment] subclass.
 */
class TrainerFragment : Fragment(R.layout.fragment_trainer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = TrainerAdapter(Dummy.actions, activity)
    }

}
