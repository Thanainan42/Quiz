package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class quiz2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        val MainActivitybutton = findViewById<Button>(R.id.button_back3)
        MainActivitybutton.setOnClickListener {
            val Intent = Intent(this, quiz3::class.java)
            startActivity(Intent)
        }

    }
}