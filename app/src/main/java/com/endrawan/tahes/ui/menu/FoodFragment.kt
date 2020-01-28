package com.endrawan.tahes.ui.menu


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.endrawan.tahes.R
import com.endrawan.tahes.adapters.FoodsAdapter
import com.endrawan.tahes.models.Dummy
import kotlinx.android.synthetic.main.fragment_food.*

/**
 * A simple [Fragment] subclass.
 */
class FoodFragment : Fragment(R.layout.fragment_food) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = FoodsAdapter(Dummy.foods)
        recyclerView.layoutManager = LinearLayoutManager(activity)
    }


}
