package com.endrawan.tahes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

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
