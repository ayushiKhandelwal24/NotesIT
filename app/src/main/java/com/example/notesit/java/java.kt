package com.example.notesit.java

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.notesit.R

class java : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val aiButton: ImageButton = findViewById(R.id.aiii)

        aiButton.setOnClickListener {
            Toast.makeText(this, "Java😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, javatopic::class.java)
            startActivity(intent)
        }
    }
}