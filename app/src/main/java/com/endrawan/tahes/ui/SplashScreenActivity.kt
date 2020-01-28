package com.endrawan.tahes.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.endrawan.tahes.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        scheduleSplashScreen()
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration = getSplashScreenDuration()
        Handler().postDelayed({
            routeToAppropriatePage()
            finish()
        }, splashScreenDuration)
    }

    private fun getSplashScreenDuration() = 2000L

    private fun routeToAppropriatePage() = startActivity(Intent(this, SignInActivity::class.java))
}
