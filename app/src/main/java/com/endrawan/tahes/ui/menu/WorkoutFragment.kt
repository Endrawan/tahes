package com.endrawan.tahes.ui.menu


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.endrawan.tahes.R
import com.endrawan.tahes.adapters.WorkoutsAdapter
import com.endrawan.tahes.models.Dummy
import kotlinx.android.synthetic.main.fragment_workout.*

/**
 * A simple [Fragment] subclass.
 */
class WorkoutFragment : Fragment(R.layout.fragment_workout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = WorkoutsAdapter(Dummy.workouts)
        recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
    }


}
