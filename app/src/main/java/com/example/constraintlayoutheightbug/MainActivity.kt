package com.example.constraintlayoutheightbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.doOnLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<View>(R.id.issue)

        view.doOnLayout {
            Log.d("Issue", "View has height = ${view.height}, measured = ${view.measuredHeight}")
        }
    }
}