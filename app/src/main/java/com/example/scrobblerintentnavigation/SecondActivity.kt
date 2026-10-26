package com.example.scrobblerintentnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("message").orEmpty()
        val intentType = intent.getStringExtra("intent_type").orEmpty()

        findViewById<TextView>(R.id.received_text).text =
            "$message\n$intentType"
    }
}