package com.nadafeteiha.and102_prework

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.helloBtn)
        btnHello.setOnClickListener {
            Toast.makeText(this, R.string.hello_back, Toast.LENGTH_SHORT).show()
        }

    }
}