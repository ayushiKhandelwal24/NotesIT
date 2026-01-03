package com.example.notesit.advancejava

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notesit.R

class advancejava : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_advancejava)

        val aiButton: ImageButton = findViewById(R.id.aiii)


        aiButton.setOnClickListener {
            Toast.makeText(this, "Advance Java😒😒", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, advancejavatopic::class.java)
            startActivity(intent)
        }

    }
}