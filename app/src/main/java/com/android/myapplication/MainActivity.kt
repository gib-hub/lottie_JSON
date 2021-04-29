package com.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var on = true
    var checked = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchh.setOnClickListener {
            if (on == true) {
                switchh.setMinAndMaxProgress(0.0f, 0.5f)
                switchh.playAnimation();
                Toast.makeText(this, "on", Toast.LENGTH_SHORT).show()
                on = false

            } else {
                switchh.setMinAndMaxProgress(0.5f, 1.0f);
                switchh.playAnimation();
                Toast.makeText(this, "off", Toast.LENGTH_SHORT).show()
                on = false
            }
        }

        button.setOnClickListener {
            button.playAnimation()
            Toast.makeText(this, "tertekan", Toast.LENGTH_SHORT).show()
        }

        checkbox.setOnClickListener {
            if (checked == 1) {
                checkbox.speed = 1f
                checkbox.playAnimation()
                checked = 0

            } else{
                checkbox.speed = -1f
                checkbox.playAnimation()
                checked = 1
            }
        }

    }
}



