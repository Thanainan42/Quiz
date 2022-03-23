package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class quiz3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)

        val MainActivitybutton = findViewById<Button>(R.id.button_back4)
        MainActivitybutton.setOnClickListener {
            val Intent = Intent(this, quiz4::class.java)
            startActivity(Intent)
        }

    }
}