package com.example.nowy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() + findViewById<TextView>(R.id.textInputEditText).text.toString()
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "Mikołaj Leszczyński"
        }
    }
}