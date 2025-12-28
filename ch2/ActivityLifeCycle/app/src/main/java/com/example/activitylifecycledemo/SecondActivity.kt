package com.example.activitylifecycledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)

        val tvintentdata = findViewById<android.widget.TextView>(R.id.tvintentdata)
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        if (message != null) {
            tvintentdata.text = message
        }
        enableEdgeToEdge()

    }
}
