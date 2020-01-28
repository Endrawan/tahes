package com.endrawan.tahes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.endrawan.tahes.R
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        submit.setOnClickListener {
            finish()
        }
    }
}
