package com.example.scrobblerintentnavigation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.message_input)

        findViewById<Button>(R.id.explicit_intent).setOnClickListener {
            val next = Intent(this, SecondActivity::class.java)

            next.putExtra("message", input.text.toString())
            next.putExtra("intent_type", "Явный Intent")

            startActivity(next)
        }

        findViewById<Button>(R.id.implicit_intent).setOnClickListener {
            val next = Intent("com.example.intentdemo.SHOW_TEXT")

            next.putExtra("message", input.text.toString())
            next.putExtra("intent_type", "Неявный Intent")

            startActivity(next)
        }
    }
}