package com.example.activitylifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        Log.d("MainActivity", "onCreate called")
        enableEdgeToEdge()
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart called")
    }
}
