package com.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class SplashScreenActivity : AppCompatActivity() {

    val delay = 3000L

    val handler = Handler()
    val runnable = Runnable {
        animLayout()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        handler.postDelayed(runnable, delay)
    }

    private fun animLayout(){
        startActivity(Intent(this, MainActivity::class.java))
        overridePendingTransition(R.anim.layout_in, R.anim.layout_out)
        finish()
    }

}




