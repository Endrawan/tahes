package com.endrawan.tahes.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.endrawan.tahes.R
import com.endrawan.tahes.adapters.SignUpFragmentAdapter
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val viewPagerAdapter = SignUpFragmentAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter

        next.setOnClickListener {
            viewPager.apply {
                currentItem++
                if (next.text == "Selesai")
                    startActivity(
                        Intent(
                            applicationContext,
                            MainActivity::class.java
                        )
                    )

                when (currentItem) {
                    3 -> next.text = "Selesai"
                    else -> next.text = "Selanjutnya"
                }
            }
        }

        previous.setOnClickListener {
            viewPager.apply {
                currentItem--
                if (currentItem == 3)
                    next.text = "Selesai"
                else
                    next.text = "Selanjutnya"

            }
        }
    }


}
