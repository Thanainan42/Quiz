package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class quiz4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz4)

        val MainActivitybutton = findViewById<Button>(R.id.button_back5)
        MainActivitybutton.setOnClickListener {
            val Intent = Intent(this, quiz5::class.java)
            startActivity(Intent)
        }

    }
}