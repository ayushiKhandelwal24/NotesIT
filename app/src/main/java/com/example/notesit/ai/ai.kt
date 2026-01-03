package com.example.notesit.ai

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notesit.R



class ai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai)

        val aiButton: ImageButton = findViewById(R.id.aiii)
        aiButton.setOnClickListener {
            Toast.makeText(this, "AI 😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, aitopic::class.java)
            startActivity(intent)
        }
    }
}
