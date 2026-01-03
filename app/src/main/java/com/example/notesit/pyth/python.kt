package com.example.notesit.pyth

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.notesit.R

class python : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_python)

        val aiButton: ImageButton = findViewById(R.id.pythonn)
        aiButton.setOnClickListener {
            Toast.makeText(this, "Python😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, pythtopic::class.java)
            startActivity(intent)
        }
    }
}